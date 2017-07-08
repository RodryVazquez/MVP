package com.example.rodry.mvpdemo.Views.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rodry.mvpdemo.R;
import com.example.rodry.mvpdemo.Services.Home.ContactModel;
import com.example.rodry.mvpdemo.Views.HomeDetail;
import com.example.rodry.mvpdemo.Views.Login;

import java.util.List;

/**
 * Created by Rodry on 7/7/2017.
 */

public class HomeAdapter extends BaseAdapter {

    private List<ContactModel> dataSet;
    private Context context;

    public HomeAdapter(Context context, List<ContactModel> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_home, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final ContactModel contactModel = (ContactModel) getItem(position);
        viewHolder.ContactId.setText(String.valueOf(contactModel.getContactId()));
        viewHolder.Name.setText(contactModel.getName());
        viewHolder.Gender.setText(contactModel.getGender());
        viewHolder.Age.setText(String.valueOf(contactModel.getAge()));

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HomeDetail.class);
                intent.putExtra("Parcelable",contactModel);
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    //Holder pattern
    private static class ViewHolder {
        TextView ContactId;
        TextView Name;
        TextView Gender;
        TextView Age;

        public ViewHolder(View view) {
            ContactId = (TextView) view.findViewById(R.id.txtContactId);
            Name = (TextView) view.findViewById(R.id.txtName);
            Gender = (TextView) view.findViewById(R.id.txtGender);
            Age = (TextView) view.findViewById(R.id.txtAge);
        }
    }
}
