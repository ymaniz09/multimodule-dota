package com.ymaniz09.core

sealed class ProgressBarState {
    object Loading : ProgressBarState()

    object Idle : ProgressBarState()
}
