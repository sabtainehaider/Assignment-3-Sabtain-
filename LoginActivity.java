FirebaseAuth auth = FirebaseAuth.getInstance();

btnLogin.setOnClickListener(v -> {
    auth.signInWithEmailAndPassword(
        edtEmail.getText().toString(),
        edtPassword.getText().toString()
    ).addOnSuccessListener(authResult -> {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }).addOnFailureListener(e ->
        Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
    );
});
