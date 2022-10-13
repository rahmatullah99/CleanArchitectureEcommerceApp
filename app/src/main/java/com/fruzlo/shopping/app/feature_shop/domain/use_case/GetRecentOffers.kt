package com.fruzlo.shopping.app.feature_shop.domain.use_case

import com.fruzlo.shopping.app.feature_shop.domain.repository.Repository
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import javax.inject.Inject

class GetRecentOffers @Inject constructor(val repository: Repository) {

    suspend operator fun invoke(): List<CarouselItem> {
        return repository.getRecentOffers()
    }

}