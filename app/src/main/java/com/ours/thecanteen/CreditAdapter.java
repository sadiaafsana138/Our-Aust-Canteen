package com.ours.thecanteen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CreditAdapter extends RecyclerView.Adapter<CreditAdapter.ViewHolder> {

    private ArrayList<ModelFood> mlist;
    private Context mContext;
    TextView cost_show;



    CreditAdapter(Context context, ArrayList<ModelFood>list){
        mContext=context;
        mlist=list;
    }
    public void CreditAdapter(Context context,ArrayList<ModelFood>list,TextView costTextView)
    {
        mContext=context;
        mlist=list;
        cost_show=costTextView;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.credit_layout,parent,false);

        ViewHolder viewHolder= new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final ModelFood foodItem = mlist.get(position);

        ImageView image = holder.item_image;

        TextView name,place,price;

        name=holder.item_name;
      // place=holder.item_place;
        price=holder.item_price;

        image.setImageResource(foodItem.getImage());

        name.setText(foodItem.getName());
       // place.setText(foodItem.getPlace());
        price.setText(foodItem.getPrice());




    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView item_image;
        TextView item_name, item_place,item_price;
        public LinearLayout holder_;
        CheckBox checkBox;

        public ViewHolder(View itemView) {
            super(itemView);

            item_image= itemView.findViewById(R.id.item_image);

            item_name= itemView.findViewById(R.id.item_name);
           // item_place= itemView.findViewById(R.id.item_place);
            item_price= itemView.findViewById(R.id.item_price);




        }
    }
}
