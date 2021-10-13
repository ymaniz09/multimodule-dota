package com.ymaniz09.core

sealed class UIComponent {
    /**
     * An error on use cases could result in a Dialog for instance Ò
     */
    data class Dialog(
        val title: String,
        val description: String,
    ) : UIComponent()

    /**
     * Like a logging case
     */
    data class None(
        val message: String,
    ) : UIComponent()
}
