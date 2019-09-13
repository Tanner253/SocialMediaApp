package com.example.socialmediaattempt;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter implements RecyclerView.Adapter<UserListAdapter.UserListViewHolder> {
    private final ArrayList userList;

    public UserListAdapter(ArrayList userList){
        this.userList = userList;

    }

    public class UserListViewHolder extends RecyclerView.ViewHolder(
            public UserListViewHolder(View view){
                super(View);

            }
            );
}
