package com.xiaofei.entity;

public class FlimVideo {
   private  String video_name;
   private  String video_index;
   private  String video_state;
   private  String update_time;
   private  String video_director;
   private  String video_star;
   private  String flim_image;
   private  String flim_type;
    private  String flim_play;

    public String getVideo_name() {
        return video_name;
    }

    public void setVideo_name(String video_name) {
        this.video_name = video_name;
    }

    public String getVideo_index() {
        return video_index;
    }

    public void setVideo_index(String video_index) {
        this.video_index = video_index;
    }

    public String getVideo_state() {
        return video_state;
    }

    public void setVideo_state(String video_state) {
        this.video_state = video_state;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getVideo_director() {
        return video_director;
    }

    public void setVideo_director(String video_director) {
        this.video_director = video_director;
    }

    public String getVideo_star() {
        return video_star;
    }

    public void setVideo_star(String video_star) {
        this.video_star = video_star;
    }

    public String getFlim_image() {
        return flim_image;
    }

    public void setFlim_image(String flim_image) {
        this.flim_image = flim_image;
    }

    public String getFlim_type() {
        return flim_type;
    }

    public void setFlim_type(String flim_type) {
        this.flim_type = flim_type;
    }

    public String getFlim_play() {
        return flim_play;
    }

    public void setFlim_play(String flim_play) {
        this.flim_play = flim_play;
    }

    @Override
    public String toString() {
        return "FlimVideoTable{" +
                "video_name='" + video_name + '\'' +
                ", video_index='" + video_index + '\'' +
                ", video_state='" + video_state + '\'' +
                ", update_time='" + update_time + '\'' +
                ", video_director='" + video_director + '\'' +
                ", video_star='" + video_star + '\'' +
                ", flim_image='" + flim_image + '\'' +
                ", flim_type='" + flim_type + '\'' +
                ", flim_play='" + flim_play + '\'' +
                '}';
    }
}
