package com.kickstarter.services.apiresponses;

import android.os.Parcelable;

import com.kickstarter.libs.qualifiers.AutoGson;
import com.kickstarter.models.Activity;

import java.util.List;

import auto.parcel.AutoParcel;

@AutoGson
@AutoParcel
public abstract class ActivityEnvelope implements Parcelable {
  public abstract List<Activity> activities();
  public abstract UrlsEnvelope urls();

  @AutoGson
  @AutoParcel
  public abstract static class UrlsEnvelope implements Parcelable {
    public abstract ApiEnvelope api();

    @AutoGson
    @AutoParcel
    public abstract static class ApiEnvelope implements Parcelable {
      public abstract String moreActivities();
      public abstract String newerActivities();
    }
  }
}