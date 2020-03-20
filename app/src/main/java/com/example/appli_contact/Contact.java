package com.example.appli_contact;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Contact {
    private String nom;
    private String prenom;
    private String mail;
    private String ville;
    private int num;
    private boolean fav;
    private List<Contact> contactList = getDefaultList();

    public Contact(String nom, String prenom, String mail, String ville, int num, boolean fav) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.ville = ville;
        this.num = num;
        this.fav = fav;
    }

    public List<Contact> getDefaultList() {
    List<Contact> contactList = new List<Contact>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Contact> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Contact contact) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Contact> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends Contact> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Contact get(int index) {
            return null;
        }

        @Override
        public Contact set(int index, Contact element) {
            return null;
        }

        @Override
        public void add(int index, Contact element) {

        }

        @Override
        public Contact remove(int index) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Contact> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Contact> listIterator(int index) {
            return null;
        }

        @NonNull
        @Override
        public List<Contact> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
        contactList.add(new Contact("Wick", "John", "john@gmail.com", "Los Angeles", 0606060606, true));
        contactList.add(new Contact("Valentines", "Bill", "bill@gmail.com", "New York", 0707070707, false));
        return contactList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }
}
