package com.example.pokestar.vaccineremind.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.pokestar.mine.MineListAdapter;
import com.example.pokestar.mine.MineListData;
import com.example.pokestar.vaccineremind.MineFragment_MineBaby;
import com.example.pokestar.vaccineremind.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MineFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MineFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MineFragment extends Fragment {


    private OnFragmentInteractionListener mListener;
    private Button mineBabyButton;
    private Button vaccineRecordButton;
    private Button mineNewsButton;
    private Button oneselfButton;
    private Button articleCollectButton;
    private Button weButton;
//    private ImageView moreImageView;

    private List<MineListData> mineListDataList = new ArrayList<>();


    public static MineFragment newInstance() {
        MineFragment fragment = new MineFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /*View view = inflater.inflate(R.layout.fragment_mine, container, false);
        mineBabyButton = view.findViewById(R.id.set_image_view);
        vaccineRecordButton = view.findViewById(R.id.vaccine_record_button);
        mineNewsButton = view.findViewById(R.id.mine_news_button);
        oneselfButton = view.findViewById(R.id.oneself_button);
        articleCollectButton = view.findViewById(R.id.article_collect_button);
        weButton = view.findViewById(R.id.we_button);*/
        View view = inflater.inflate(R.layout.fragment_mine, container, false);

        initTitles();
        MineListAdapter adapter = new MineListAdapter(getActivity(),R.layout.mine_list_item,mineListDataList);
        ListView listView = view.findViewById(R.id.mine_list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MineListData mineListData = mineListDataList.get(position);
                Intent intent = new Intent(getActivity(),MineFragment_MineBaby.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void initTitles(){
        MineListData a1 = new MineListData("我的宝宝");
        mineListDataList.add(a1);
        MineListData a2 = new MineListData("疫苗记录");
        mineListDataList.add(a2);
        MineListData a3 = new MineListData("我的消息");
        mineListDataList.add(a3);
        MineListData a4 = new MineListData("文章收藏");
        mineListDataList.add(a4);
        MineListData a5 = new MineListData("个人");
        mineListDataList.add(a5);
        MineListData a6 = new MineListData("设置");
        mineListDataList.add(a6);
        MineListData a7 = new MineListData("关于我们");
        mineListDataList.add(a7);

    }

    private void replaceFragment(Fragment fragment){
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
