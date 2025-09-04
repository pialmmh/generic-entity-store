package com.telcobright.db.genericentity.mysqlbillion.entities;

/**
 * Special Entity 4: Unicode and special characters
 */
public class SpecialEntity4 {
    private Long id;
    private String unicodeText; // UTF8MB4
    private String emojiField;
    private String multiLanguage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnicodeText() {
        return unicodeText;
    }

    public void setUnicodeText(String unicodeText) {
        this.unicodeText = unicodeText;
    }

    public String getEmojiField() {
        return emojiField;
    }

    public void setEmojiField(String emojiField) {
        this.emojiField = emojiField;
    }

    public String getMultiLanguage() {
        return multiLanguage;
    }

    public void setMultiLanguage(String multiLanguage) {
        this.multiLanguage = multiLanguage;
    }

}
