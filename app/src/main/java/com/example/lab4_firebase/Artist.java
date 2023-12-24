package com.example.lab4_firebase;

public class Artist {

    String artistId;
    String artistName;

    // Default constructor (required by Firebase)
    public Artist() {
        // Default constructor required for calls to DataSnapshot.getValue(Artist.class)
    }

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

}
