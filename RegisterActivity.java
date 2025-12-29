FirebaseAuth auth = FirebaseAuth.getInstance();

btnRegister.setOnClickListener(v -> {
    String email = edtEmail.getText().toString();
    String password = edtPassword.getText().toString();

    if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
        edtEmail.setError("Invalid Email");
        return;
    }

    if (password.length() < 6) {
        edtPassword.setError("Password must be 6 characters");
        return;
    }

    auth.createUserWithEmailAndPassword(email, password)
        .addOnSuccessListener(authResult -> {
            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, LoginActivity.class));
        })
        .addOnFailureListener(e ->
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show()
        );
});
