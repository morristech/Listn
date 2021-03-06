package com.jesperqvarfordt.listn.explore.di

import com.jesperqvarfordt.listn.dagger.ViewScope
import com.jesperqvarfordt.listn.device.imagecache.ImageCache
import com.jesperqvarfordt.listn.domain.usecase.*
import com.jesperqvarfordt.listn.explore.ExploreContract
import com.jesperqvarfordt.listn.explore.ExplorePresenter
import dagger.Module
import dagger.Provides

@Module
class TracksModule {

    @Provides
    @ViewScope
    fun presenter(search: SearchTracksUseCase,
                  setPlaylistAndPlay: SetPlaylistAndPlayUseCase,
                  getChartsUseCase: GetChartsUseCase,
                  getTracksOnChartUseCase: GetTracksOnChartUseCase,
                  listenToMediaInfoUseCase: SubscribeToMediaInfoUseCase,
                  imageCache: ImageCache): ExploreContract.Presenter {
        return ExplorePresenter(search, setPlaylistAndPlay, getChartsUseCase, getTracksOnChartUseCase, listenToMediaInfoUseCase, imageCache)
    }

}