package com.sist.manager;

import java.io.Serializable;
/*
 *    <table class="list-wrap">      태그명.클래스명  태그명#아이디명
 *     ----- 태그명   --------- 구분자 => class / id 
 *     table.list-wrap td.info img
 *      <tr>                          ------  ---
 *                                     중복    중복이 없는 상태
 *        <td class="info">
 *          <a class="cover"><img src=""></a>
 *        </td>
 *        <td class="info">
 *          <a class="title aaa">노래명</a>
 *          table.list-wrap td.info a.title
 *        </td>
 *        <td class="info">
 *          <a class="artist aaa">가수명</a>
 *          table.list-wrap td.info a.artist
 *        </td>
 *      </tr>
 *    </table>
 *    <a class="info">bbbbb</a> a.info 
 */
public class GenieMusicVO implements Serializable{
        private int no;
        private String title;
        private String singer;
        private String album;
        private String poster;
        private int idcrement; // 등폭 
        private String state; //유지,상승,하강 
        private int cno;//구분자 
        private String key; // 동영상 
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public String getPoster() {
			return poster;
		}
		public void setPoster(String poster) {
			this.poster = poster;
		}
		public int getIdcrement() {
			return idcrement;
		}
		public void setIdcrement(int idcrement) {
			this.idcrement = idcrement;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getCno() {
			return cno;
		}
		public void setCno(int cno) {
			this.cno = cno;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
     
     
}
