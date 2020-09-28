package com.example.startapp007;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class NextActivity extends AppCompatActivity {

    TextView mainId = findViewById(R.id.main_id);
    TextView mainName = findViewById(R.id.main_name);
    TextView mainUsername = findViewById(R.id.main_username);
    TextView mainEmail = findViewById(R.id.main_email);
    TextView addressStreet = findViewById(R.id.address_street);
    TextView addressSuite = findViewById(R.id.address_suite);
    TextView addressCity = findViewById(R.id.address_city);
    TextView addressZipcode = findViewById(R.id.address_zipcode);
    TextView geoLat = findViewById(R.id.geo_lat);
    TextView geoLng = findViewById(R.id.geo_lng);
    TextView mainPhone = findViewById(R.id.main_phone);
    TextView mainWebsite = findViewById(R.id.main_website);
    TextView companyName = findViewById(R.id.company_name);
    TextView companyCatchPhrase = findViewById(R.id.company_catchPhrase);
    TextView companyBs = findViewById(R.id.company_bs);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        MainInfo fullInfo = new MainInfo();

        mainId.setText(String.valueOf(fullInfo.getId()));
        mainName.setText(fullInfo.getName());
        mainUsername.setText(fullInfo.getUsername());
        mainEmail.setText(fullInfo.getEmail());
        addressStreet.setText(String.valueOf(fullInfo.getAddress().getStreet()));
        addressSuite.setText(String.valueOf(fullInfo.getAddress().getSuite()));
        addressCity.setText(String.valueOf(fullInfo.getAddress().getCity()));
        addressZipcode.setText(String.valueOf(fullInfo.getAddress().getZipcode()));
        geoLat.setText(String.valueOf(fullInfo.getAddress().getGeo().getLat()));
        geoLng.setText(String.valueOf(fullInfo.getAddress().getGeo().getLng()));
        mainPhone.setText(fullInfo.getPhone());
        mainWebsite.setText(fullInfo.getWebsite());
        companyName.setText(String.valueOf(fullInfo.getCompany().getName()));
        companyCatchPhrase.setText(String.valueOf(fullInfo.getCompany().getCatchPhrase()));
        companyBs.setText(String.valueOf(fullInfo.getCompany().getBs()));


    }

//    MainInfo var = new MainInfo();
//    mainId.setText(String.valueOf(var.getId()));
//    mainName.setText(MainInfo.var.getName());

//    MainInfo roster = list.get(position);
//    mainName.setText(roster.getName());
//    mainName.setText(var.getName());
//

//    public TextView getMainName() {
//        return mainName;
//    }
//    public void setMainId(TextView mainId) {
//        this.mainId = mainId;
//    }

    //    TextView mainId = mainId.setId(roster.getId);
//    mainName
//
//        holder.textId.setText(String.valueOf(roster.getId()));
//        holder.textName.setText(roster.getName());
}
