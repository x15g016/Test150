package jp.ac.x15g016chiba_fjb.test13;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.TextureView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CameraPreview mCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //インスタンスの取得
        TextureView textureView = (TextureView) findViewById(R.id.textureView);
//カメラプレビュー用クラスの作成
        mCamera = new CameraPreview();
        mCamera.setTextureView(textureView);
        mCamera.open(0);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //タッチされたら撮影
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            String filePath;
            //デフォルトストレージのトップディレクトリにファイルを作成
            filePath = Environment.getExternalStorageDirectory() + "/test.jpg";


            //アプリケーション用ディレクトリにファイルを作成
            //こちらを使った場合、WRITE_EXTERNAL_STORAGE不要
            //filePath = getExternalFilesDir(null)+"/test.jpg";

            //プレビューの保存
            mCamera.save(filePath);

            //メッセージを出力
            Toast.makeText(this,filePath,Toast.LENGTH_LONG).show();
        }


        return super.onTouchEvent(event);
    }
}
