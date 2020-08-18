package com.ours.thecanteen;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ours.thecanteen.CartMenuActivity;
import com.ours.thecanteen.CostBarActivity;
import com.ours.thecanteen.ModelFood;
import com.ours.thecanteen.R;
import com.ours.thecanteen.food_info;

import java.util.ArrayList;


public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    public interface OnItemClickListener{
        void OnItemClick(int position);
    }
    private ArrayList<ModelFood> mlist;
   public Context mContext;
    TextView cost_show;
    private OnItemClickListener myLister;
    int old_price=0;



    public FoodAdapter(ArrayList<ModelFood> mlist, Context mContext, OnItemClickListener myLister) {
        this.mlist = mlist;
        this.mContext = mContext;
        this.myLister = myLister;
    }

    FoodAdapter(Context context, ArrayList<ModelFood> list){
        mContext=context;
        mlist=list;
    }
    FoodAdapter(Context context,ArrayList<ModelFood>list,TextView costTextView)
    {
        mContext=context;
        mlist=list;
        cost_show=costTextView;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.all_category_menu,parent,false);

        ViewHolder viewHolder= new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        final ModelFood foodItem = mlist.get(position);

        ImageView image = holder.item_image;

        final TextView name,place,price;
        CheckBox checkBox;

        name=holder.item_name;
        place=holder.item_place;
        price=holder.item_price;
        checkBox=holder.checkBox;


        image.setImageResource(foodItem.getImage());

        name.setText(foodItem.getName());
       // place.setText(foodItem.getPlace());
        price.setText(foodItem.getPrice());



        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(holder.checkBox.isChecked())
                {

                    int price= Integer.parseInt(holder.item_price.getText().toString());
                    old_price+=price;
                    food_info food=new food_info(holder.item_name.getText().toString(),holder.item_price.getText().toString());
                    Toast.makeText(mContext,"Added to the Cart", Toast.LENGTH_SHORT).show();
                    cost_show.setText(Integer.toString(old_price));
                    CostBarActivity.totalFoodCost=old_price;




                }


            }
        });

        }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView item_image;
        TextView item_name, item_place,item_price,cost;
        LinearLayout parent_layout;
        CheckBox checkBox;

        public ViewHolder(View itemView) {
            super(itemView);

            item_image= itemView.findViewById(R.id.item_image);

            item_name= itemView.findViewById(R.id.item_name);
            //item_place= itemView.findViewById(R.id.item_place);
            item_price= itemView.findViewById(R.id.item_price);
            checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
            parent_layout=(LinearLayout) itemView.findViewById(R.id.parent_layout);
            checkBox=(CheckBox)itemView.findViewById(R.id.checkbox_input);
            cost=(TextView)itemView.findViewById(R.id.cost_show);
            //itemView.SetOnItemClickListener()


        }
    }
}
