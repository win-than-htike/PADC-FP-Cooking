package com.padc.cooking.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padc.cooking.CookingApp;
import com.padc.cooking.R;
import com.padc.cooking.VO.MarketListVO;
import com.padc.cooking.views.holders.MarketViewHolder;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Su Su Oo on 17-Sep-16.
 */
public class MarketRVAdapter extends RecyclerView.Adapter<MarketViewHolder> {


    private List<MarketListVO> mmarketList;
    private LayoutInflater minflater;
    private MarketViewHolder.ControllerMarketItem mControllerMarketItem;


    public MarketRVAdapter(List<MarketListVO> marketList, MarketViewHolder.ControllerMarketItem controllerMarketItem) {
        if (marketList != null) {
            this.mmarketList = marketList;
        } else {
            this.mmarketList = new ArrayList<>();
        }
        minflater = LayoutInflater.from(CookingApp.getContext());
        mmarketList = marketList ;
        mControllerMarketItem = controllerMarketItem;
    }


    @Override
    public MarketViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = minflater.inflate(R.layout.market_list_row, parent, false);
        return new MarketViewHolder(itemView, mControllerMarketItem);
    }

    @Override
    public void onBindViewHolder(MarketViewHolder holder, int position) {

        holder.bindData(mmarketList.get(position));

    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return mmarketList.size();

    }

 /*   @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MarketViewHolder viewHolder;
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.market_list_row, parent, false);
            viewHolder = new MarketViewHolder(convertView, controllerAttractionItem);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MarketViewHolder) convertView.getTag();
        }

        viewHolder.bindData(getItem(position));
        return convertView;
    }
*/

    public void setNewData(List<MarketListVO> newAttractionList) {
        mmarketList = newAttractionList;
        notifyDataSetChanged();
    }
}