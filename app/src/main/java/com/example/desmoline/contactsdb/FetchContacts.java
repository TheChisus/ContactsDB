package com.example.desmoline.contactsdb;

import android.os.AsyncTask;

import com.example.desmoline.myapplication.backend.contactsApi.ContactsApi;
import com.example.desmoline.myapplication.backend.contactsApi.model.Contact;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by desmoline on 4/15/16.
 */

public class FetchContacts extends AsyncTask<Void, Void, List<Contact>>{

    ContactsApi api = new ContactsApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
            .build();

    ArrayList<Contact> contacts;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }


    @Override
    protected List<Contact> doInBackground(Void... params) {
        try {
          return api.getContacts().execute().getItems();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(List<Contact> contacts) {
        super.onPostExecute(contacts);
    }


}
