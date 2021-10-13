package com.ymaniz09.core

sealed class DataState<T> {
    /**
     * Like an error case
     */
    data class Response<T>(
        val uiComponent: UIComponent
    ) : DataState<T>()

    /**
     * The data holder class
     */
    data class Data<T>(
        val data: T? = null
    ) : DataState<T>()


    data class Loading<T>(
        val progressBarState: ProgressBarState = ProgressBarState.Idle
    ) : DataState<T>()
}
