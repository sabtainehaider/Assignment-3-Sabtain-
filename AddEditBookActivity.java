FirebaseFirestore db = FirebaseFirestore.getInstance();

btnSave.setOnClickListener(v -> {
    Book book = new Book(
        edtTitle.getText().toString(),
        edtAuthor.getText().toString(),
        edtISBN.getText().toString(),
        Integer.parseInt(edtYear.getText().toString())
    );

    db.collection("books").add(book)
        .addOnSuccessListener(doc ->
            Toast.makeText(this, "Book Added", Toast.LENGTH_SHORT).show()
        );
});
