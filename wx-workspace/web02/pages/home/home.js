// pages/home/home.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    tabbar_index:0
  },
  
  onChange(event) {
    // console.log(event.detail);
    this.setData({
      tabbar_index: event.detail
    });
    
    let url = '';

    switch (event.detail){
      case 0: url ='/pages/home/home';break;
      case 1: url = '/pages/test/test'; break;
      case 2: url = '/pages/layout/layout'; break;
      case 3: url = ''; break;
    }
    wx.navigateTo({
      url: url,
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})