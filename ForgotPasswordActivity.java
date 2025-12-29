FirebaseAuth.getInstance()
    .sendPasswordResetEmail(email)
    .addOnSuccessListener(unused ->
        Toast.makeText(this, "Reset Email Sent", Toast.LENGTH_SHORT).show()
    );
