package Interface;

import Enum.Mood;

public interface MoodState {
    String getCurrentMood();
    void setMood(Mood mood);
}
