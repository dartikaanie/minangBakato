package com.example.minangbakato.ui.petatah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.minangbakato.R;
import com.example.minangbakato.model.Kamus;
import com.example.minangbakato.ui.kamus.KamusMingDoFragment;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PepatahAdapter extends RecyclerView.Adapter<PepatahAdapter.KamusHolder> {
    private OnKlikKeyword klikKeyword;
    private ArrayList<Kamus> dataKamus = new ArrayList<>();

    public void addItem(ArrayList<Kamus> data) {
        this.dataKamus = data;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public KamusHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pepatah, parent, false);
        return new KamusHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull KamusHolder holder, int position) {
        Kamus kamusItem = dataKamus.get(position);
        holder.tvKeyword.setText(kamusItem.getKeyword());
        holder.tvArti.setText(kamusItem.getArti());

    }

    @Override
    public int getItemCount() {
        if(dataKamus != null){
            return dataKamus.size();
        }
        return 0;
    }

    public void setClickHandler(KamusMingDoFragment kamusMingDoFragment) {
    }

    public class KamusHolder extends RecyclerView.ViewHolder{
        TextView tvKeyword, tvArti;
        public KamusHolder(View itemView) {
            super(itemView);
            tvKeyword = itemView.findViewById(R.id.keywordItem);
            tvArti = itemView.findViewById(R.id.arti);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Kamus kamusItem = dataKamus.get(getAdapterPosition());
//                    klikKeyword.OnKlikKeyword(kamusItem);
//                }
//            });
        }

    }

    public interface OnKlikKeyword{
        void OnKlikKeyword(Kamus kamusItem);

    }

    public void setClickHandler(OnKlikKeyword clickHandler) {
        this.klikKeyword = clickHandler;
    }
}
