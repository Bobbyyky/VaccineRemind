package com.example.pokestar.mine;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pokestar.vaccineremind.R;

import java.util.List;

/**
 * Created by Shinelon on 2018/8/23.
 */

public class MineListAdapter extends ArrayAdapter<MineListData>{

    private int resourceId;

    public MineListAdapter(@NonNull Context context, int resource, List<MineListData> mineListDataList) {
        super(context, resource,mineListDataList);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MineListData mineListData = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView mineListTitle = view.findViewById(R.id.mine_list_title);
        mineListTitle.setText(mineListData.getMineListdata());
        return view;
    }
}
