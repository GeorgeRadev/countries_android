package org.game.countries;

import android.content.Context;

import java.util.HashMap;

public class DB {
    public static final String[][] dbStrings =
            new String[][]{
// new String[]{"title", "capital", "iso_code", "continent"},
//
                    new String[]{"Afghanistan", "Kabul", "af", "Asia"},
//
                    new String[]{"Albania", "Tirana", "al", "Europe"},
//
                    new String[]{"Algeria", "Algiers", "dz", "Africa"},
//
                    new String[]{"American Samoa", "Pago Pago", "as", "Oceania"},
//
                    new String[]{"Andorra", "Andorra-la-Vella", "ad", "Europe"},
//
                    new String[]{"Angola", "Luanda", "ao", "Africa"},
//
                    new String[]{"Anguilla", "The Valley", "ai", "America"},
//
                    new String[]{"Antigua and Barbuda", "St. John’s", "ag", "America"},
//
                    new String[]{"Argentina", "Buenos Aires", "ar", "America"},
//
                    new String[]{"Armenia", "Yerevan", "am", "Europe"},
//
                    new String[]{"Aruba", "Oranjestad ", "aw", "America"},
//
                    new String[]{"Australia", "Canberra", "au", "Oceania"},
//
                    new String[]{"Austria", "Vienna", "at", "Europe"},
//
                    new String[]{"Azerbaijan", "Baku", "az", "Europe"},
//
                    new String[]{"Bahamas", "Nassau", "bs", "America"},
//
                    new String[]{"Bahrain", "Manama", "bh", "Asia"},
//
                    new String[]{"Bangladesh", "Dhaka", "bd", "Asia"},
//
                    new String[]{"Barbados", "Bridgetown", "bb", "America"},
//
                    new String[]{"Belarus", "Minsk", "by", "Europe"},
//
                    new String[]{"Belgium", "Brussels", "be", "Europe"},
//
                    new String[]{"Belize", "Belmopan", "bz", "America"},
//
                    new String[]{"Benin", "Porto-Novo", "bj", "Africa"},
//
                    new String[]{"Bermuda", "Hamilton", "bm", "America"},
//
                    new String[]{"Bhutan", "Thimphu", "bt", "Asia"},
//
                    new String[]{"Bolivia", "La Paz", "bo", "America"},
//
                    new String[]{"Bosnia and Herzegovina", "Sarajevo", "ba", "Europe"},
//
                    new String[]{"Botswana", "Gaborone", "bw", "Africa"},
//
                    new String[]{"Brazil", "Brasília", "br", "America"},
//
                    new String[]{"British Indian Ocean Territory", "Diego Garcia", "io", "Asia"},
//
                    new String[]{"British Virgin Islands", "Road Town", "vg", "America"},
//
                    new String[]{"Brunei", "Bandar Seri Begawan", "bn", "Asia"},
//
                    new String[]{"Bulgaria", "Sofia", "bg", "Europe"},
//
                    new String[]{"Burkina Faso", "Ouagadougou", "bf", "Africa"},
//
                    new String[]{"Burundi", "Bujumbura", "bi", "Africa"},
//
                    new String[]{"Cambodia", "Phnom Penh", "kh", "Asia"},
//
                    new String[]{"Cameroon", "Yaoundé", "cm", "Africa"},
//
                    new String[]{"Canada", "Ottawa", "ca", "America"},
//
                    new String[]{"Cape Verde", "Praia", "cv", "Africa"},
//
                    new String[]{"Cayman Islands", "George Town", "ky", "America"},
//
                    new String[]{"Central African Republic", "Bangui", "cf", "Africa"},
//
                    new String[]{"Chad", "N’djamena", "td", "Africa"},
//
                    new String[]{"Chile", "Santiago", "cl", "America"},
//
                    new String[]{"China", "Beijing", "cn", "Asia"},
//
                    new String[]{"Christmas Island", "The Settlement", "cx", "Asia"},
//
                    new String[]{"Cocos (Keeling) Islands", "West Island ", "cc", "Asia"},
//
                    new String[]{"Colombia", "Bogotá", "co", "America"},
//
                    new String[]{"Comoros", "Moroni", "km", "Africa"},
//
                    new String[]{"Congo", "Kinshasa", "cd", "Africa"},
//
                    new String[]{"Cook Islands", "Avarua", "ck", "Oceania"},
//
                    new String[]{"Costa Rica", "San José", "cr", "America"},
//
                    new String[]{"Cote d'Ivoire", "Yamoussoukro", "ci", "Africa"},
//
                    new String[]{"Croatia", "Zagreb", "hr", "Europe"},
//
                    new String[]{"Cuba", "Havana", "cu", "America"},
//
                    new String[]{"Curasao", "Willemstad", "cw", "America"},
//
                    new String[]{"Cyprus", "Nicosia", "cy", "Asia"},
//
                    new String[]{"Czech Republic", "Prague", "cz", "Europe"},
//
                    new String[]{"Denmark", "Copenhagen", "dk", "Europe"},
//
                    new String[]{"Djibouti", "Djibouti", "dj", "Africa"},
//
                    new String[]{"Dominica", "Roseau", "dm", "America"},
//
                    new String[]{"Dominican Republic", "Santo Domingo", "do", "America"},
//
                    new String[]{"Ecuador", "Quito", "ec", "America"},
//
                    new String[]{"Egypt", "Cairo", "eg", "Africa"},
//
                    new String[]{"El Salvador", "San Salvador", "sv", "America"},
//
                    new String[]{"Equatorial Guinea", "Malabo", "gq", "Africa"},
//
                    new String[]{"Eritrea", "Asmara", "er", "Africa"},
//
                    new String[]{"Estonia", "Tallinn", "ee", "Europe"},
//
                    new String[]{"Ethiopia", "Addis Ababa", "et", "Africa"},
//
                    new String[]{"Falkland Islands", "Stanley", "fk", "America"},
//
                    new String[]{"Faroe Islands", "Torshavn", "fo", "Europe"},
//
                    new String[]{"Fiji", "Suva", "fj", "Oceania"},
//
                    new String[]{"Finland", "Helsinki", "fi", "Europe"},
//
                    new String[]{"France", "Paris", "fr", "Europe"},
//
                    new String[]{"French Polynesia", "Papeete", "pf", "Oceania"},
//
                    new String[]{"Gabon", "Libreville", "ga", "Africa"},
//
                    new String[]{"Gambia", "Banjul", "gm", "Africa"},
//
                    new String[]{"Georgia", "Tbilisi", "ge", "Europe"},
//
                    new String[]{"Germany", "Berlin", "de", "Europe"},
//
                    new String[]{"Ghana", "Accra", "gh", "Africa"},
//
                    new String[]{"Gibraltar", "Gibraltar", "gi", "Europe"},
//
                    new String[]{"Greece", "Athens ", "gr", "Europe"},
//
                    new String[]{"Greenland", "Nuuk", "gl", "America"},
//
                    new String[]{"Grenada", "Saint George's", "gd", "America"},
//
                    new String[]{"Guam", "Hagatna (Agana)", "gu", "Oceania"},
//
                    new String[]{"Guatemala", "Guatemala City", "gt", "America"},
//
                    new String[]{"Guernsey", "Saint Peter Port", "gg", "Europe"},
//
                    new String[]{"Guinea", "Conakry", "gn", "Africa"},
//
                    new String[]{"Guinea-Bissau", "Bissau", "gw", "Africa"},
//
                    new String[]{"Guyana", "Georgetown", "gy", "America"},
//
                    new String[]{"Haiti", "Port-au-Prince", "ht", "America"},
//
                    new String[]{"Honduras", "Tegucigalpa", "hn", "America"},
//
                    new String[]{"Hong Kong", "Hong Kong", "hk", "Asia"},
//
                    new String[]{"Hungary", "Budapest", "hu", "Europe"},
//
                    new String[]{"Iceland", "Reykjavik", "is", "Europe"},
//
                    new String[]{"India", "Delhi", "in", "Asia"},
//
                    new String[]{"Indonesia", "Jakarta", "id", "Asia"},
//
                    new String[]{"Iran", "Tehran", "ir", "Asia"},
//
                    new String[]{"Iraq", "Baghdad", "iq", "Asia"},
//
                    new String[]{"Ireland", "Dublin", "ie", "Europe"},
//
                    new String[]{"Isle of Man", "Douglas", "im", "Europe"},
//
                    new String[]{"Israel", "Jerusalem", "il", "Asia"},
//
                    new String[]{"Italy", "Rome", "it", "Europe"},
//
                    new String[]{"Jamaica", "Kingston", "jm", "America"},
//
                    new String[]{"Japan", "Tokyo", "jp", "Asia"},
//
                    new String[]{"Jersey", "Saint Helier", "je", "Europe"},
//
                    new String[]{"Jordan", "Amman", "jo", "Asia"},
//
                    new String[]{"Kazakhstan", "Astana", "kz", "Asia"},
//
                    new String[]{"Kenya", "Nairobi", "ke", "Africa"},
//
                    new String[]{"Kiribati", "Tarawa", "ki", "Oceania"},
//
                    new String[]{"Kosovo", "Pristina", "xk", "Europe"},
//
                    new String[]{"Kuwait", "Kuwait City", "kw", "Asia"},
//
                    new String[]{"Kyrgyzstan", "Bishkek", "kg", "Asia"},
//
                    new String[]{"Laos", "Vientiane", "la", "Asia"},
//
                    new String[]{"Latvia", "Riga", "lv", "Europe"},
//
                    new String[]{"Lebanon", "Beirut", "lb", "Asia"},
//
                    new String[]{"Lesotho", "Maseru", "ls", "Africa"},
//
                    new String[]{"Liberia", "Monrovia", "lr", "Africa"},
//
                    new String[]{"Libya", "Tripoli", "ly", "Africa"},
//
                    new String[]{"Liechtenstein", "Vaduz", "li", "Europe"},
//
                    new String[]{"Lithuania", "Vilnius", "lt", "Europe"},
//
                    new String[]{"Luxembourg", "Luxembourg", "lu", "Europe"},
//
                    new String[]{"Macau", "Macau", "mo", "Asia"},
//
                    new String[]{"Macedonia", "Skopje", "mk", "Europe"},
//
                    new String[]{"Madagascar", "Antananarivo", "mg", "Africa"},
//
                    new String[]{"Malawi", "Lilongwe", "mw", "Africa"},
//
                    new String[]{"Malaysia", "Kuala Lumpur", "my", "Asia"},
//
                    new String[]{"Maldives", "Malé", "mv", "Asia"},
//
                    new String[]{"Mali", "Bamako", "ml", "Africa"},
//
                    new String[]{"Malta", "Valletta", "mt", "Europe"},
//
                    new String[]{"Marshall Islands", "Majuro", "mh", "Oceania"},
//
                    new String[]{"Mauritania", "Nouakchott", "mr", "Africa"},
//
                    new String[]{"Mauritius", "Port Louis", "mu", "Africa"},
//
                    new String[]{"Mayotte", "Mamoudzou", "yt", "Africa"},
//
                    new String[]{"Mexico", "Mexico City", "mx", "America"},
//
                    new String[]{"Micronesia", "Palikir", "fm", "Oceania"},
//
                    new String[]{"Moldova", "Kishinev", "md", "Europe"},
//
                    new String[]{"Monaco", "Monaco", "mc", "Europe"},
//
                    new String[]{"Mongolia", "Ulan Bator", "mn", "Asia"},
//
                    new String[]{"Montenegro", "Podgorica", "me", "Europe"},
//
                    new String[]{"Montserrat", "Plymouth", "ms", "America"},
//
                    new String[]{"Morocco", "Rabat", "ma", "Africa"},
//
                    new String[]{"Mozambique", "Maputo", "mz", "Africa"},
//
                    new String[]{"Myanmar", "Naypyidaw", "mm", "Asia"},
//
                    new String[]{"Namibia", "Windhoek", "na", "Africa"},
//
                    new String[]{"Nauru", "Yaren", "nr", "Oceania"},
//
                    new String[]{"Nepal", "Kathmandu", "np", "Asia"},
//
                    new String[]{"Netherlands", "Amsterdam", "nl", "Europe"},
//
                    new String[]{"Netherlands Antilles", "Willemstad", "an", "America"},
//
                    new String[]{"New Zealand", "Wellington", "nz", "Oceania"},
//
                    new String[]{"Nicaragua", "Managua", "ni", "America"},
//
                    new String[]{"Niger", "Niamey", "ne", "Africa"},
//
                    new String[]{"Nigeria", "Abuja", "ng", "Africa"},
//
                    new String[]{"Niue", "Alofi", "nu", "Oceania"},
//
                    new String[]{"Norfolk Island", "Kingston", "nf", "Oceania"},
//
                    new String[]{"North Korea", "Pyongyang", "kp", "Asia"},
//
                    new String[]{"Northern Mariana Islands", "Saipan", "mp", "Oceania"},
//
                    new String[]{"Norway", "Oslo", "no", "Europe"},
//
                    new String[]{"Oman", "Muscat", "om", "Asia"},
//
                    new String[]{"Pakistan", "Islamabad", "pk", "Asia"},
//
                    new String[]{"Palau", "Ngerulmud", "pw", "Oceania"},
//
                    new String[]{"Panama", "Panamá City", "pa", "America"},
//
                    new String[]{"Papua New Guinea", "Port Moresby", "pg", "Oceania"},
//
                    new String[]{"Paraguay", "Asunción", "py", "America"},
//
                    new String[]{"Peru", "Lima", "pe", "America"},
//
                    new String[]{"Philippines", "Manila", "ph", "Asia"},
//
                    new String[]{"Pitcairn Islands", "Adamstown", "pn", "Oceania"},
//
                    new String[]{"Poland", "Warsaw", "pl", "Europe"},
//
                    new String[]{"Portugal", "Lisbon", "pt", "Europe"},
//
                    new String[]{"Puerto Rico", "San Juan", "pr", "America"},
//
                    new String[]{"Qatar", "Doha", "qa", "Asia"},
//
                    new String[]{"Romania", "Bucharest ", "ro", "Europe"},
//
                    new String[]{"Russia", "Moscow", "ru", "Europe"},
//
                    new String[]{"Rwanda", "Kigali", "rw", "Africa"},
//
                    new String[]{"Saint Barthelemy", "Gustavia", "bl", "America"},
//
                    new String[]{"Saint Helena", "Jamestown", "sh", "Africa"},
//
                    new String[]{"Saint Kitts and Nevis", "Basseterre", "kn", "America"},
//
                    new String[]{"Saint Lucia", "Castries", "lc", "America"},
//
                    new String[]{"Saint Vincent and the Grenadines", "Kingstown", "vc", "America"},
//
                    new String[]{"Samoa", "Apia", "ws", "Oceania"},
//
                    new String[]{"San Marino", "San Marino", "sm", "Europe"},
//
                    new String[]{"Sao Tome and Principe", "São Tomé", "st", "Africa"},
//
                    new String[]{"Saudi Arabia", "Riyadh", "sa", "Asia"},
//
                    new String[]{"Senegal", "Dakar", "sn", "Africa"},
//
                    new String[]{"Serbia", "Belgrade", "rs", "Europe"},
//
                    new String[]{"Seychelles", "Victoria", "sc", "Africa"},
//
                    new String[]{"Sierra Leone", "Freetown", "sl", "Africa"},
//
                    new String[]{"Singapore", "Singapore", "sg", "Asia"},
//
                    new String[]{"Sint Maarten", "Philipsburg", "sx", "America"},
//
                    new String[]{"Slovakia", "Bratislava", "sk", "Europe"},
//
                    new String[]{"Slovenia", "Ljubljana", "si", "Europe"},
//
                    new String[]{"Solomon Islands", "Honiara", "sb", "Oceania"},
//
                    new String[]{"Somalia", "Mogadishu", "so", "Africa"},
//
                    new String[]{"South Africa", "Pretoria", "za", "Africa"},
//
                    new String[]{"South Georgia and the South Sandwich Islands", "Grytviken", "gs", "America"},
//
                    new String[]{"South Korea", "Seoul", "kr", "Asia"},
//
                    new String[]{"Spain", "Madrid", "es", "Europe"},
//
                    new String[]{"Sri Lanka", "Colombo", "lk", "Asia"},
//
                    new String[]{"Sudan", "Khartoum", "sd", "Africa"},
//
                    new String[]{"Suriname", "Paramaribo", "sr", "America"},
//
                    new String[]{"Swaziland", "Mbabane", "sz", "Africa"},
//
                    new String[]{"Sweden", "Stockholm", "se", "Europe"},
//
                    new String[]{"Switzerland", "Berne", "ch", "Europe"},
//
                    new String[]{"Syria", "Damascus", "sy", "Asia"},
//
                    new String[]{"Taiwan", "Taipei", "tw", "Asia"},
//
                    new String[]{"Tajikistan", "Dushanbe", "tj", "Asia"},
//
                    new String[]{"Tanzania", "Dodoma", "tz", "Africa"},
//
                    new String[]{"Thailand", "Bangkok", "th", "Asia"},
//
                    new String[]{"Timor-Leste", "Dili", "tl", "Asia"},
//
                    new String[]{"Togo", "Lomé", "tg", "Africa"},
//
                    new String[]{"Tokelau", "none", "tk", "Oceania"},
//
                    new String[]{"Tonga", "Nuku’alofa", "to", "Oceania"},
//
                    new String[]{"Trinidad and Tobago", "Port-of-Spain", "tt", "America"},
//
                    new String[]{"Tunisia", "Tunis", "tn", "Africa"},
//
                    new String[]{"Turkey", "Ankara", "tr", "Asia"},
//
                    new String[]{"Turkmenistan", "Ashkhabad", "tm", "Asia"},
//
                    new String[]{"Turks and Caicos Islands", "Cockburn Town", "tc", "America"},
//
                    new String[]{"Tuvalu", "Funafuti", "tv", "Oceania"},
//
                    new String[]{"Uganda", "Kampala", "ug", "Africa"},
//
                    new String[]{"Ukraine", "Kiev", "ua", "Europe"},
//
                    new String[]{"United Arab Emirates", "Abu Dhabi ", "ae", "Asia"},
//
                    new String[]{"United Kingdom", "London", "gb", "Europe"},
//
                    new String[]{"United States", "Washington, DC", "us", "America"},
//
                    new String[]{"United States Virgin Islands", "Charlotte Amalie", "vi", "America"},
//
                    new String[]{"Uruguay", "Montevideo", "uy", "America"},
//
                    new String[]{"Uzbekistan", "Tashkent", "uz", "Asia"},
//
                    new String[]{"Vanuatu", "Vila", "vu", "Oceania"},
//
                    new String[]{"Vatican City", "The Vatican", "va", "Europe"},
//
                    new String[]{"Venezuela", "Caracas", "ve", "America"},
//
                    new String[]{"Vietnam", "Hanoi", "vn", "Asia"},
//
                    new String[]{"Wallis and Futuna", "Mata-Utu", "wf", "America"},
//
                    new String[]{"Western Sahara", "none", "eh", "Africa"},
//
                    new String[]{"Yemen", "San’a", "ye", "Asia"},
//
                    new String[]{"Zambia", "Lusaka", "zm", "Africa"},
//
                    new String[]{"Zimbabwe", "Harare", "zw", "Africa"}
            };

    // Images are named <prefix><iso_code>, e.g. flag_bg, quiz_flag_bg, quiz_location_bg
    public static final String FLAG_PREFIX = "flag_";
    public static final String QUIZ_FLAG_PREFIX = "quiz_flag_";
    public static final String QUIZ_LOCATION_PREFIX = "quiz_location_";

    private static final HashMap<String, Integer> imageCache = new HashMap<String, Integer>(256);

    public static int getFlag(Context context, String isoCode) {
        String name = FLAG_PREFIX + isoCode;
        Integer resId = imageCache.get(name);
        if (resId != null) {
            return resId;
        }
        resId = getResourceByName(context, name);
        imageCache.put(name, resId);
        return resId;
    }

    public static int getResourceByName(Context context, String name) {
        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }
}
