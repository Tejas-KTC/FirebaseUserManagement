package com.example.firebaseusermanagement;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class FirebaseUserManagement {

    private FirebaseAuth mAuth;

    public FirebaseUserManagement() {
        mAuth = FirebaseAuth.getInstance();
    }

    public void signUp(String email, String password, final OnCompleteListener<AuthResult> onCompleteListener) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(onCompleteListener);
    }

    public void signIn(String email, String password, final OnCompleteListener<AuthResult> onCompleteListener) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(onCompleteListener);
    }

    public void signOut() {
        mAuth.signOut();
    }

    // Additional CRUD operations can be added here
}
