package com.udacity.googleindiascholarships.challenges.entities;

import android.media.Image;

import java.util.ArrayList;

public class Challenge {
    private String challenge_name;
    private String authorNameChallenge;
    private String imageUploadChallenge;
    private String descriptionChallenge;
    private String gitHubLinkChallenge;
    private Image imageAuthor;
    private int placholderImage;
    ArrayList<String> list_challenge_submissions;


    Challenge(){

    }


    public Challenge(String challenge_name, ArrayList<String> list_challenge_submissions){
        this.challenge_name = challenge_name;
        this.list_challenge_submissions = list_challenge_submissions;

    }

    public ArrayList<String> getList_challenge_submissions() {
        return list_challenge_submissions;
    }

    public Challenge(String authorNameChallenge) {
        this.authorNameChallenge = authorNameChallenge;
    }


    public String getAuthorNameChallenge() {
        return authorNameChallenge;
    }

    public String getChallenge_name() {
        return challenge_name;
    }

    public String getDescriptionChallenge() {
        return descriptionChallenge;
    }

    public String getGitHubLinkChallenge() {
        return gitHubLinkChallenge;
    }

    public String getImageUploadChallenge() {
        return imageUploadChallenge;
    }

    public Image getImageAuthor() {
        return imageAuthor;
    }
}
