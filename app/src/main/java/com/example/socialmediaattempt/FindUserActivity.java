package com.example.socialmediaattempt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FindUserActivity extends AppCompatActivity {

    private  RecyclerView muserList;
            private RecyclerView.Adapter mUserListsAdapter;
                    private RecyclerView.LayoutManager mUserListLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_user);

        initializeRecyclerView();

        userList = new ArrayList<>();
        initializeRecyclerView();



    }

    private void initializeRecyclerView() {
        muserList = findViewById(R.id.userList);
        muserList.setNestedScrollingEnabled(false);
        muserList.setHasFixedSize(false);
        mUserListLayoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);
        muserList.setLayoutManager(mUserListLayoutManager);

        mUserListsAdapter = new UserListAdapter(userList);
        }
    }
}
