package com.example.desmoline.contactsdb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.desmoline.myapplication.backend.contactsApi.model.Contact;

import java.util.ArrayList;

/**
 * Created by desmoline on 4/14/16.
 */
public class ContactsAdapter extends ArrayAdapter{

    public ContactsAdapter(Context context, ArrayList<Contact> contacts){
        super(context,0,contacts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Contact contact = (Contact) getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.contact, parent, false);
        }
        TextView cont = (TextView) convertView.findViewById(R.id.contact);
        cont.setText(contact.getName());
        return convertView;
    }
}
