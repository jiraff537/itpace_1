package com.simbirsoft.itplace.domain.entity;

import java.util.List;

public class PersonalData {
    private String aboutMe;
    private String avatarPath;
    private String target;
    private List<String> experiences;
    private List<String> educations;
    private List<String> additionalEducations;
    private List<String> skills;
    private List<String> examplesCode;

    public PersonalData(
            String aboutMe,
            String avatarPath,
            String target,
            List<String> experiences,
            List<String> educations,
            List<String> additionalEducations,
            List<String> skills,
            List<String> examplesCode) {
        this.aboutMe = aboutMe;
        this.avatarPath = avatarPath;
        this.target = target;
        this.experiences = experiences;
        this.educations = educations;
        this.additionalEducations = additionalEducations;
        this.skills = skills;
        this.examplesCode = examplesCode;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<String> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<String> experiences) {
        this.experiences = experiences;
    }

    public List<String> getEducations() {
        return educations;
    }

    public void setEducations(List<String> educations) {
        this.educations = educations;
    }

    public List<String> getAdditionalEducations() {
        return additionalEducations;
    }

    public void setAdditionalEducations(List<String> additionalEducations) {
        this.additionalEducations = additionalEducations;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getExamplesCode() {
        return examplesCode;
    }

    public void setExamplesCode(List<String> examplesCode) {
        this.examplesCode = examplesCode;
    }
}
