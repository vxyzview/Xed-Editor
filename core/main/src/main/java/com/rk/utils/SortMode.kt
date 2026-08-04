package com.rk.utils

import com.rk.resources.strings

enum class SortMode(val stringRes: Int) {
    SORT_BY_NAME(strings.sort_by_name),
    SORT_BY_SIZE(strings.sort_by_size),
    SORT_BY_DATE(strings.sort_by_date),
}
