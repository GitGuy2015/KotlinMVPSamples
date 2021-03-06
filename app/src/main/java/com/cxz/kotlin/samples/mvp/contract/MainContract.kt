package com.cxz.kotlin.samples.mvp.contract

import com.cxz.kotlin.baselibs.mvp.IModel
import com.cxz.kotlin.baselibs.mvp.IPresenter
import com.cxz.kotlin.baselibs.mvp.IView
import com.cxz.kotlin.samples.bean.Banner
import com.cxz.kotlin.samples.bean.HttpResult
import io.reactivex.Observable

/**
 * @author admin
 * @date 2018/11/20
 * @desc
 */
interface MainContract {

    interface View : IView {
        fun showBanners(banners: MutableList<Banner>)
    }

    interface Presenter : IPresenter<View> {
        fun getBanner()
        fun getBanner2()
        fun getBanner3()
    }

    interface Model : IModel {
        fun getBanners(): Observable<HttpResult<MutableList<Banner>>>
    }

}