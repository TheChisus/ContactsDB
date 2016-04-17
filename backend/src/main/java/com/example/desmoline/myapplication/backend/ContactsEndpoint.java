/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.desmoline.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.googlecode.objectify.Work;

import java.util.List;

import static com.example.desmoline.myapplication.backend.ObjectifyProvider.ofy;

/** An endpoint class we are exposing */
@Api(
  name = "contactsApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.desmoline.example.com",
    ownerName = "backend.myapplication.desmoline.example.com",
    packagePath=""
  )
)

public class ContactsEndpoint {

    @ApiMethod(name = "storeContact")
    public void storeContact(final Contact contact) {
        Contact c = ofy().transactNew(5, new Work<Contact>() {
            @Override
            public Contact run() {
                ofy().save().entity(contact).now();
                return contact;
            }
        });
    }

    @ApiMethod(name = "getContacts")
    public List<Contact> getContacts() {
        List<Contact> contacts= ofy().load().type(Contact.class).limit(100).list();
        return contacts;
    }


    @ApiMethod(name = "deleteContact")
    public void deleteContact(Contact contact) {
        ofy().delete().entity(contact).now();
    }

}
