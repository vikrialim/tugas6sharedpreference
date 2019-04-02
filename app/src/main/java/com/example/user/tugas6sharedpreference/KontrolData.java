package com.example.user.tugas6sharedpreference;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class KontrolData {
    Context context;
    List<KontrolModel> kontrolModels = new ArrayList<>();
    MainView view;
    public KontrolData(MainView view, Context context){
        this.view=view;
        this.context=context;
    }

    public void setData(){
        KontrolModel orang;
        orang= new KontrolModel("RADITYA DIKA", R.drawable.radityadika);
        kontrolModels.add(orang);
        orang= new KontrolModel("DEDDY COBUZIER",R.drawable.deddy);
        kontrolModels.add(orang);
        orang= new KontrolModel("AGUNG HAPSAH",R.drawable.agung);
        kontrolModels.add(orang);
        orang= new KontrolModel("EDHOZELL",R.drawable.edhozell);
        kontrolModels.add(orang);
        orang= new KontrolModel("JESS NO LIMIT",R.drawable.jessnolimit);
        kontrolModels.add(orang);
        orang= new KontrolModel("MIAWUAG",R.drawable.miawuag);
        kontrolModels.add(orang);
        view.onSuccess(kontrolModels);
    }
}
