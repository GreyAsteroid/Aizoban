package com.jparkie.aizoban.controllers.factories;

import com.jparkie.aizoban.controllers.sources.English_Batoto;
import com.jparkie.aizoban.controllers.sources.English_MangaEden;
import com.jparkie.aizoban.controllers.sources.English_MangaHere;
import com.jparkie.aizoban.controllers.sources.English_MangaPanda;
import com.jparkie.aizoban.controllers.sources.English_MangaReader;
import com.jparkie.aizoban.controllers.sources.English_Mangafox;
import com.jparkie.aizoban.controllers.sources.Italian_MangaEden;
import com.jparkie.aizoban.controllers.sources.Source;
import com.jparkie.aizoban.controllers.sources.Spanish_Batoto;
import com.jparkie.aizoban.controllers.sources.Spanish_MangaHere;
import com.jparkie.aizoban.utils.PreferenceUtils;

public class SourceFactory {
    private SourceFactory() {
        throw new AssertionError();
    }

    public static Source checkNames(String sourceName) {
        Source currentSource;

        if (sourceName.equalsIgnoreCase(English_Batoto.NAME)) {
            currentSource = new English_Batoto();
        } else if (sourceName.equalsIgnoreCase(English_MangaEden.NAME)) {
            currentSource = new English_MangaEden();
        } else if (sourceName.equalsIgnoreCase(English_Mangafox.NAME)) {
            currentSource = new English_Mangafox();
        } else if (sourceName.equalsIgnoreCase(English_MangaPanda.NAME)) {
            currentSource = new English_MangaPanda();
        } else if (sourceName.equalsIgnoreCase(English_MangaHere.NAME)) {
            currentSource = new English_MangaHere();
        } else if (sourceName.equalsIgnoreCase(English_MangaReader.NAME)) {
            currentSource = new English_MangaReader();
        } else if (sourceName.equalsIgnoreCase(Italian_MangaEden.NAME)) {
            currentSource = new Italian_MangaEden();
        } else if (sourceName.equalsIgnoreCase(Spanish_MangaHere.NAME)) {
            currentSource = new Spanish_MangaHere();
        } else if (sourceName.equalsIgnoreCase(Spanish_Batoto.NAME)) {
            currentSource = new Spanish_Batoto();
        } else {
            currentSource = new English_MangaEden();
        }

        return currentSource;
    }

    public static Source constructSourceFromPreferences() {
        String sourceName = PreferenceUtils.getSource();
        return checkNames(sourceName);
    }

    public static Source constructSourceFromName(String sourceName) {
        return checkNames(sourceName);
    }

    public static Source constructSourceFromUrl(String url) {
        Source currentSource;

        if (url.contains(English_Batoto.BASE_URL)) {
            currentSource = new English_Batoto();
        } else if (url.contains(English_MangaEden.BASE_URL)) {
            currentSource = new English_MangaEden();
        } else if (url.contains(English_Mangafox.BASE_URL)) {
            currentSource = new English_Mangafox();
        } else if (url.contains(English_MangaPanda.BASE_URL)) {
            currentSource = new English_MangaPanda();
        } else if (url.contains(English_MangaHere.BASE_URL)) {
            currentSource = new English_MangaHere();
        } else if (url.contains(English_MangaReader.BASE_URL)) {
            currentSource = new English_MangaReader();
        } else if (url.contains(Italian_MangaEden.BASE_URL)) {
            currentSource = new Italian_MangaEden();
        } else if (url.contains(Spanish_MangaHere.BASE_URL)) {
            currentSource = new Spanish_MangaHere();
        } else if (url.contains(Spanish_Batoto.BASE_URL)) {
            currentSource = new Spanish_Batoto();
        } else {
            currentSource = new English_MangaEden();
        }

        return currentSource;
    }
}
