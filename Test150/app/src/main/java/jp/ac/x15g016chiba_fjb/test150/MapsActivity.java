package jp.ac.x15g016chiba_fjb.test150;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(35.7016369, 139.9836126);                //位置設定
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,15.0f));   //範囲2.0～21.0(全体～詳細)
        mMap.addMarker(new MarkerOptions().position(sydney).title("マーカーテスト"));
        mMap.setOnMarkerClickListener(this);
        sydney = new LatLng(35.7043291,139.9842291);
        mMap.addMarker(new MarkerOptions().position(sydney).title("船橋情報ビジネス専門学校"));
        //自分の位置をマップ上に表示
        MyLocationSource ls = new MyLocationSource(this);
        googleMap.setMyLocationEnabled(true); //警告は無視
        googleMap.setLocationSource(ls);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker.getPosition(),15.0f));
        return false;

    }
}
