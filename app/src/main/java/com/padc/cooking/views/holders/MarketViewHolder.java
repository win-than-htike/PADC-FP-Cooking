package com.padc.cooking.views.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padc.cooking.R;
import com.padc.cooking.VO.MarketListVO;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Su Su Oo on 17-Sep-16.
 */
public class MarketViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

   @BindView(R.id.m_photo)
    ImageView marketphoto;

    @BindView(R.id.m_name)
    TextView marketname;

    @BindView(R.id.m_address)
    TextView marketaddress;

    private MarketListVO mMarket;
    private ControllerAttractionItem mController;


    public MarketViewHolder(View itemView,ControllerAttractionItem controller){

        super(itemView);
        ButterKnife.bind(this,itemView);
        itemView.setOnClickListener(this);
        mController = controller;
    }

    public void bindData(){
       // mMarket=Market;
        marketname.setText("47th Street Branch");
        marketaddress.setText("Corner of 47th Street & Anawrahta Road, Botahtaung Township, Yangon");

        Glide.with(marketphoto.getContext())
                .load(R.drawable.m_47)
                .centerCrop()
                .placeholder(R.drawable.m_47)
                .error(R.drawable.m_47)
                .into(marketphoto);

    }

   //private void initializeData(){
        //marketListVOs = new ArrayList<>();
      //  marketListVOs.add(new MarketListVO("47th Street Branch", "Corner of 47th Street & Anawrahta Road, Botahtaung Township, Yangon", R.drawable.m_47));
        //marketListVOs.add(new MarketListVO("AKK Shopping Center Branch", "AKK Shopping Center, Laydaungkan Road, Thingangyun Township, Yangon ", R.drawable.m_akk));
        //marketListVOs.add(new MarketListVO("Aung San Branch", "Aung San Stadium (North Wing), Mingalar Taung Nyunt Township, Yangon", R.drawable.m_aungsan));
   // }



    @Override
    public void onClick(View view) {

        mController.onTapAttraction(mMarket,marketphoto);

    }


    public interface ControllerAttractionItem {
        void onTapAttraction(MarketListVO market, ImageView marketphoto);
    }

}
