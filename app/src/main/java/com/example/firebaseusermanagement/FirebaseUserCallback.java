package com.example.firebaseusermanagement;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;

public interface FirebaseUserCallback {
    void onAuthSuccess(FirebaseUser user);
    void onAuthFailure(String message);
}
