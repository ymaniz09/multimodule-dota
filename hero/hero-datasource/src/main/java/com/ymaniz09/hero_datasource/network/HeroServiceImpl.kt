package com.ymaniz09.hero_datasource.network

import com.ymaniz09.hero_domain.Hero
import io.ktor.client.*
import io.ktor.client.request.*


class HeroServiceImpl(private val httpClient: HttpClient) : HeroService {
    override suspend fun getHeroStats(): List<Hero> {
        return httpClient.get<List<HeroDto>> {
            url(EndPoints.HERO_STATS)
        }.map { it.toHero() }
    }
}