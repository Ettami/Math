package com.example.math;
import android.content.Context;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class OlympAdapter extends ArrayAdapter<Olymp> {
    private Context context;
    private Olymp[] olymp;
    public OlympAdapter(Context context,Olymp[] olymp){
        super(context, R.layout.item, olymp);
        this.context=context;
        this.olymp = olymp;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item,parent,false);
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(this.olymp[position].getName());

        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        imageView.setImageResource(R.drawable.ic_launcher_foreground);
        if(this.olymp[position].getName().equals("ММО")){
            imageView.setImageResource(R.drawable.mmo);
        }
        else {
            imageView.setImageResource(R.drawable.ic_launcher_foreground);
        }
        if(this.olymp[position].getName().equals("Высшая проба")){
            imageView.setImageResource(R.drawable.hse);
        }
        if(this.olymp[position].getName().equals("Физтех")){
            imageView.setImageResource(R.drawable.mfti);
        }
        if(this.olymp[position].getName().equals("Курчатов")){
            imageView.setImageResource(R.drawable.mifi);
        }
        if(this.olymp[position].getName().equals("Ломоносов")){
            imageView.setImageResource(R.drawable.lomon);
        }
        if(this.olymp[position].getName().equals("СПбГУ")){
            imageView.setImageResource(R.drawable.spbgu);
        }
        if(this.olymp[position].getName().equals("ПВГ!")){
            imageView.setImageResource(R.drawable.vorobey);
        }
        if(this.olymp[position].getName().equals("Итмо")){
            imageView.setImageResource(R.drawable.itmo);
        }

        if(this.olymp[position].getName().equals("Оммо")){
            imageView.setImageResource(R.drawable.ommo);
        }

        if(this.olymp[position].getName().equals("Формула Единства")){
            imageView.setImageResource(R.drawable.fe);
        }

        if(this.olymp[position].getName().equals("Росатом")){
            imageView.setImageResource(R.drawable.rosatom);
        }

        if(this.olymp[position].getName().equals("Всесиб")){
            imageView.setImageResource(R.drawable.vsesib);
        }
        if(this.olymp[position].getName().equals("Бельчонок")){
            imageView.setImageResource(R.drawable.belka);
        }
        if(this.olymp[position].getName().equals("Саммат")){
            imageView.setImageResource(R.drawable.sammat);
        }
        if(this.olymp[position].getName().equals("Иннополис")){
            imageView.setImageResource(R.drawable.inop);
        }
        if(this.olymp[position].getName().equals("КФУ")){
            imageView.setImageResource(R.drawable.kfu);
        }
        if(this.olymp[position].getName().equals("Шаг в будущее")){
            imageView.setImageResource(R.drawable.shag);
        }





        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toDev = new Intent(context,DevActivity.class);
                toDev.putExtra("name",olymp[position].getName());
                toDev.putExtra("level",olymp[position].getLevel());
                toDev.putExtra("datebegin",olymp[position].getDatebegin());
                toDev.putExtra("dateend",olymp[position].getDateend());
                toDev.putExtra("regotb",olymp[position].getRegotb());
                toDev.putExtra("regsak",olymp[position].getRegsak());
                context.startActivity(toDev);
            }
        });
        return view;
    }
}

