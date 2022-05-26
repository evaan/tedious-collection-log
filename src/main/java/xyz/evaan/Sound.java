package xyz.evaan;

public enum Sound {
    COLLECTION_LOG_SLOT("the_collection_log.wav");

    private final String resourceName;

    Sound(String resNam) {
        resourceName = resNam;
    }

    String getResourceName() {
        return resourceName;
    }
}
