package com.araby.game_store_api.common;

import java.util.List;

public class PageResponse<T> {
    private List<T> content;
    private int number;
    private int size;
    private int totalElements;
    private int totalPages;
    private boolean Isfirst;
    private boolean IsLast;

}
