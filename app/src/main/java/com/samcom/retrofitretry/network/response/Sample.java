package com.samcom.retrofitretry.network.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sample {

    /**
     * error : false
     * message : success
     * data : [{"id":"1","countryName":"United States","countryCode":"1","voice":"1","sms":"1","mms":"1","iso":"US","flag":"http://96.126.117.17/dollardigits/flags/us.png"},{"id":"2","countryName":"Canada","countryCode":"1","voice":"1","sms":"1","mms":"1","iso":"CA","flag":"http://96.126.117.17/dollardigits/flags/ca.png"},{"id":"3","countryName":"Israel","countryCode":"972","voice":"1","sms":"1","mms":"0","iso":"IL","flag":"http://96.126.117.17/dollardigits/flags/il.png"},{"id":"4","countryName":"Puerto Rico","countryCode":"1","voice":"1","sms":"1","mms":"0","iso":"PR","flag":"http://96.126.117.17/dollardigits/flags/pr.png"},{"id":"5","countryName":"United Kingdom","countryCode":"44","voice":"1","sms":"1","mms":"0","iso":"GB","flag":"http://96.126.117.17/dollardigits/flags/gb.png"},{"id":"6","countryName":"Austria","countryCode":"43","voice":"1","sms":"0","mms":"0","iso":"AT","flag":"http://96.126.117.17/dollardigits/flags/at.png"},{"id":"7","countryName":"Belgium","countryCode":"32","voice":"1","sms":"0","mms":"0","iso":"BE","flag":"http://96.126.117.17/dollardigits/flags/be.png"},{"id":"8","countryName":"Brazil","countryCode":"55","voice":"1","sms":"0","mms":"0","iso":"BR","flag":"http://96.126.117.17/dollardigits/flags/br.png"},{"id":"9","countryName":"Bulgaria","countryCode":"359","voice":"1","sms":"0","mms":"0","iso":"BG","flag":"http://96.126.117.17/dollardigits/flags/bg.png"},{"id":"10","countryName":"Cyprus","countryCode":"357","voice":"1","sms":"0","mms":"0","iso":"CY","flag":"http://96.126.117.17/dollardigits/flags/cy.png"},{"id":"11","countryName":"Denmark","countryCode":"45","voice":"1","sms":"0","mms":"0","iso":"DK","flag":"http://96.126.117.17/dollardigits/flags/dk.png"},{"id":"12","countryName":"Dominican Republic","countryCode":"1","voice":"1","sms":"0","mms":"0","iso":"DO","flag":"http://96.126.117.17/dollardigits/flags/do.png"},{"id":"13","countryName":"El Salvador","countryCode":"503","voice":"1","sms":"0","mms":"0","iso":"SV","flag":"http://96.126.117.17/dollardigits/flags/sv.png"},{"id":"14","countryName":"Estonia","countryCode":"372","voice":"1","sms":"0","mms":"0","iso":"EE","flag":"http://96.126.117.17/dollardigits/flags/ee.png"},{"id":"15","countryName":"France","countryCode":"33","voice":"1","sms":"0","mms":"0","iso":"FR","flag":"http://96.126.117.17/dollardigits/flags/fr.png"},{"id":"16","countryName":"Indonesia","countryCode":"62","voice":"1","sms":"0","mms":"0","iso":"ID","flag":"http://96.126.117.17/dollardigits/flags/id.png"},{"id":"17","countryName":"Japan","countryCode":"81","voice":"1","sms":"0","mms":"0","iso":"JP","flag":"http://96.126.117.17/dollardigits/flags/jp.png"},{"id":"18","countryName":"Lithuania","countryCode":"370","voice":"1","sms":"0","mms":"0","iso":"LT","flag":"http://96.126.117.17/dollardigits/flags/lt.png"},{"id":"19","countryName":"Malta","countryCode":"356","voice":"1","sms":"0","mms":"0","iso":"MT","flag":"http://96.126.117.17/dollardigits/flags/mt.png"},{"id":"20","countryName":"Malaysia","countryCode":"60","voice":"1","sms":"0","mms":"0","iso":"MY","flag":"http://96.126.117.17/dollardigits/flags/my.png"},{"id":"21","countryName":"New Zealand","countryCode":"64","voice":"1","sms":"0","mms":"0","iso":"NZ","flag":"http://96.126.117.17/dollardigits/flags/nz.png"},{"id":"22","countryName":"Peru","countryCode":"51","voice":"1","sms":"0","mms":"0","iso":"PE","flag":"http://96.126.117.17/dollardigits/flags/pe.png"},{"id":"23","countryName":"Poland","countryCode":"48","voice":"1","sms":"0","mms":"0","iso":"PL","flag":"http://96.126.117.17/dollardigits/flags/pl.png"}]
     */

    @SerializedName("error")
    private boolean error;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<DataEntity> data;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public static class DataEntity {
        /**
         * id : 1
         * countryName : United States
         * countryCode : 1
         * voice : 1
         * sms : 1
         * mms : 1
         * iso : US
         * flag : http://96.126.117.17/dollardigits/flags/us.png
         */

        @SerializedName("id")
        private String id;
        @SerializedName("countryName")
        private String countryName;
        @SerializedName("countryCode")
        private String countryCode;
        @SerializedName("voice")
        private String voice;
        @SerializedName("sms")
        private String sms;
        @SerializedName("mms")
        private String mms;
        @SerializedName("iso")
        private String iso;
        @SerializedName("flag")
        private String flag;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getVoice() {
            return voice;
        }

        public void setVoice(String voice) {
            this.voice = voice;
        }

        public String getSms() {
            return sms;
        }

        public void setSms(String sms) {
            this.sms = sms;
        }

        public String getMms() {
            return mms;
        }

        public void setMms(String mms) {
            this.mms = mms;
        }

        public String getIso() {
            return iso;
        }

        public void setIso(String iso) {
            this.iso = iso;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }
    }
}
