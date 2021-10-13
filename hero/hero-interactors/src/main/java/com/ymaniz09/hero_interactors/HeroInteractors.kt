package com.ymaniz09.hero_interactors

import com.ymaniz09.hero_datasource.network.HeroService

data class HeroInteractors(
    val getHeros: GetHeros,
) {
    companion object Factory {
        fun build(): HeroInteractors {
            val service = HeroService.build()
            return HeroInteractors(
                getHeros = GetHeros(
                    service = service,
                ),
            )
        }
    }
}