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
                    new String[]{"Algeria", "Algiers", "ag", "Africa"},
//
                    new String[]{"American Samoa", "Pago Pago", "aq", "Oceania"},
//
                    new String[]{"Andorra", "Andorra-la-Vella", "an", "Europe"},
//
                    new String[]{"Angola", "Luanda", "ao", "Africa"},
//
                    new String[]{"Anguilla", "The Valley", "av", "America"},
//
                    new String[]{"Antigua and Barbuda", "St. John’s", "ac", "America"},
//
                    new String[]{"Argentina", "Buenos Aires", "ar", "America"},
//
                    new String[]{"Armenia", "Yerevan", "am", "Europe"},
//
                    new String[]{"Aruba", "Oranjestad ", "aa", "America"},
//
                    new String[]{"Australia", "Canberra", "as", "Oceania"},
//
                    new String[]{"Austria", "Vienna", "au", "Europe"},
//
                    new String[]{"Azerbaijan", "Baku", "aj", "Europe"},
//
                    new String[]{"Bahamas", "Nassau", "bf", "America"},
//
                    new String[]{"Bahrain", "Manama", "ba", "Asia"},
//
                    new String[]{"Bangladesh", "Dhaka", "bg", "Asia"},
//
                    new String[]{"Barbados", "Bridgetown", "bb", "America"},
//
                    new String[]{"Belarus", "Minsk", "bo", "Europe"},
//
                    new String[]{"Belgium", "Brussels", "be", "Europe"},
//
                    new String[]{"Belize", "Belmopan", "bh", "America"},
//
                    new String[]{"Benin", "Porto-Novo", "bn", "Africa"},
//
                    new String[]{"Bermuda", "Hamilton", "bd", "America"},
//
                    new String[]{"Bhutan", "Thimphu", "bt", "Asia"},
//
                    new String[]{"Bolivia", "La Paz", "bl", "America"},
//
                    new String[]{"Bosnia and Herzegovina", "Sarajevo", "bk", "Europe"},
//
                    new String[]{"Botswana", "Gaborone", "bc", "Africa"},
//
                    new String[]{"Brazil", "Brasília", "br", "America"},
//
                    new String[]{"British Indian Ocean Territory", "Diego Garcia", "io", "Asia"},
//
                    new String[]{"British Virgin Islands", "Road Town", "vi", "America"},
//
                    new String[]{"Brunei", "Bandar Seri Begawan", "bx", "Asia"},
//
                    new String[]{"Bulgaria", "Sofia", "bu", "Europe"},
//
                    new String[]{"Burkina Faso", "Ouagadougou", "uv", "Africa"},
//
                    new String[]{"Burundi", "Bujumbura", "by", "Africa"},
//
                    new String[]{"Cambodia", "Phnom Penh", "cb", "Asia"},
//
                    new String[]{"Cameroon", "Yaoundé", "cm", "Africa"},
//
                    new String[]{"Canada", "Ottawa", "ca", "America"},
//
                    new String[]{"Cape Verde", "Praia", "cv", "Africa"},
//
                    new String[]{"Cayman Islands", "George Town", "cj", "America"},
//
                    new String[]{"Central African Republic", "Bangui", "ct", "Africa"},
//
                    new String[]{"Chad", "N’djamena", "cd", "Africa"},
//
                    new String[]{"Chile", "Santiago", "ci", "America"},
//
                    new String[]{"China", "Beijing", "ch", "Asia"},
//
                    new String[]{"Christmas Island", "The Settlement", "kt", "Asia"},
//
                    new String[]{"Cocos (Keeling) Islands", "West Island ", "ck", "Asia"},
//
                    new String[]{"Colombia", "Bogotá", "co", "America"},
//
                    new String[]{"Comoros", "Moroni", "cn", "Africa"},
//
                    new String[]{"Congo", "Kinshasa", "cg", "Africa"},
//
                    new String[]{"Cook Islands", "Avarua", "cw", "Oceania"},
//
                    new String[]{"Costa Rica", "San José", "cs", "America"},
//
                    new String[]{"Cote d'Ivoire", "Yamoussoukro", "iv", "Africa"},
//
                    new String[]{"Croatia", "Zagreb", "hr", "Europe"},
//
                    new String[]{"Cuba", "Havana", "cu", "America"},
//
                    new String[]{"Curasao", "Willemstad", "cc", "America"},
//
                    new String[]{"Cyprus", "Nicosia", "cy", "Asia"},
//
                    new String[]{"Czech Republic", "Prague", "ez", "Europe"},
//
                    new String[]{"Denmark", "Copenhagen", "da", "Europe"},
//
                    new String[]{"Djibouti", "Djibouti", "dj", "Africa"},
//
                    new String[]{"Dominica", "Roseau", "do", "America"},
//
                    new String[]{"Dominican Republic", "Santo Domingo", "dr", "America"},
//
                    new String[]{"Ecuador", "Quito", "ec", "America"},
//
                    new String[]{"Egypt", "Cairo", "eg", "Africa"},
//
                    new String[]{"El Salvador", "San Salvador", "es", "America"},
//
                    new String[]{"Equatorial Guinea", "Malabo", "ek", "Africa"},
//
                    new String[]{"Eritrea", "Asmara", "er", "Africa"},
//
                    new String[]{"Estonia", "Tallinn", "en", "Europe"},
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
                    new String[]{"French Polynesia", "Papeete", "fp", "Oceania"},
//
                    new String[]{"Gabon", "Libreville", "gb", "Africa"},
//
                    new String[]{"Gambia", "Banjul", "ga", "Africa"},
//
                    new String[]{"Georgia", "Tbilisi", "gg", "Europe"},
//
                    new String[]{"Germany", "Berlin", "gm", "Europe"},
//
                    new String[]{"Ghana", "Accra", "gh", "Africa"},
//
                    new String[]{"Gibraltar", "Gibraltar", "gi", "Europe"},
//
                    new String[]{"Greece", "Athens ", "gr", "Europe"},
//
                    new String[]{"Greenland", "Nuuk", "gl", "America"},
//
                    new String[]{"Grenada", "Saint George's", "gj", "America"},
//
                    new String[]{"Guam", "Hagatna (Agana)", "gq", "Oceania"},
//
                    new String[]{"Guatemala", "Guatemala City", "gt", "America"},
//
                    new String[]{"Guernsey", "Saint Peter Port", "gk", "Europe"},
//
                    new String[]{"Guinea", "Conakry", "gv", "Africa"},
//
                    new String[]{"Guinea-Bissau", "Bissau", "pu", "Africa"},
//
                    new String[]{"Guyana", "Georgetown", "gy", "America"},
//
                    new String[]{"Haiti", "Port-au-Prince", "ha", "America"},
//
                    new String[]{"Honduras", "Tegucigalpa", "ho", "America"},
//
                    new String[]{"Hong Kong", "Hong Kong", "hk", "Asia"},
//
                    new String[]{"Hungary", "Budapest", "hu", "Europe"},
//
                    new String[]{"Iceland", "Reykjavik", "ic", "Europe"},
//
                    new String[]{"India", "Delhi", "in", "Asia"},
//
                    new String[]{"Indonesia", "Jakarta", "id", "Asia"},
//
                    new String[]{"Iran", "Tehran", "ir", "Asia"},
//
                    new String[]{"Iraq", "Baghdad", "iz", "Asia"},
//
                    new String[]{"Ireland", "Dublin", "ei", "Europe"},
//
                    new String[]{"Isle of Man", "Douglas", "im", "Europe"},
//
                    new String[]{"Israel", "Jerusalem", "is", "Asia"},
//
                    new String[]{"Italy", "Rome", "it", "Europe"},
//
                    new String[]{"Jamaica", "Kingston", "jm", "America"},
//
                    new String[]{"Japan", "Tokyo", "ja", "Asia"},
//
                    new String[]{"Jersey", "Saint Helier", "je", "Europe"},
//
                    new String[]{"Jordan", "Amman", "jo", "Asia"},
//
                    new String[]{"Kazakhstan", "Astana", "kz", "Asia"},
//
                    new String[]{"Kenya", "Nairobi", "ke", "Africa"},
//
                    new String[]{"Kiribati", "Tarawa", "kr", "Oceania"},
//
                    new String[]{"Kosovo", "Pristina", "kv", "Europe"},
//
                    new String[]{"Kuwait", "Kuwait City", "ku", "Asia"},
//
                    new String[]{"Kyrgyzstan", "Bishkek", "kg", "Asia"},
//
                    new String[]{"Laos", "Vientiane", "la", "Asia"},
//
                    new String[]{"Latvia", "Riga", "lg", "Europe"},
//
                    new String[]{"Lebanon", "Beirut", "le", "Asia"},
//
                    new String[]{"Lesotho", "Maseru", "lt", "Africa"},
//
                    new String[]{"Liberia", "Monrovia", "li", "Africa"},
//
                    new String[]{"Libya", "Tripoli", "ly", "Africa"},
//
                    new String[]{"Liechtenstein", "Vaduz", "ls", "Europe"},
//
                    new String[]{"Lithuania", "Vilnius", "lh", "Europe"},
//
                    new String[]{"Luxembourg", "Luxembourg", "lu", "Europe"},
//
                    new String[]{"Macau", "Macau", "mc", "Asia"},
//
                    new String[]{"Macedonia", "Skopje", "mk", "Europe"},
//
                    new String[]{"Madagascar", "Antananarivo", "ma", "Africa"},
//
                    new String[]{"Malawi", "Lilongwe", "mi", "Africa"},
//
                    new String[]{"Malaysia", "Kuala Lumpur", "my", "Asia"},
//
                    new String[]{"Maldives", "Malé", "mv", "Asia"},
//
                    new String[]{"Mali", "Bamako", "ml", "Africa"},
//
                    new String[]{"Malta", "Valletta", "mt", "Europe"},
//
                    new String[]{"Marshall Islands", "Majuro", "rm", "Oceania"},
//
                    new String[]{"Mauritania", "Nouakchott", "mr", "Africa"},
//
                    new String[]{"Mauritius", "Port Louis", "mp", "Africa"},
//
                    new String[]{"Mayotte", "Mamoudzou", "mf", "Africa"},
//
                    new String[]{"Mexico", "Mexico City", "mx", "America"},
//
                    new String[]{"Micronesia", "Palikir", "fm", "Oceania"},
//
                    new String[]{"Moldova", "Kishinev", "md", "Europe"},
//
                    new String[]{"Monaco", "Monaco", "mn", "Europe"},
//
                    new String[]{"Mongolia", "Ulan Bator", "mg", "Asia"},
//
                    new String[]{"Montenegro", "Podgorica", "mj", "Europe"},
//
                    new String[]{"Montserrat", "Plymouth", "mh", "America"},
//
                    new String[]{"Morocco", "Rabat", "mo", "Africa"},
//
                    new String[]{"Mozambique", "Maputo", "mz", "Africa"},
//
                    new String[]{"Myanmar", "Naypyidaw", "mm", "Asia"},
//
                    new String[]{"Namibia", "Windhoek", "wa", "Africa"},
//
                    new String[]{"Nauru", "Yaren", "nr", "Oceania"},
//
                    new String[]{"Nepal", "Kathmandu", "np", "Asia"},
//
                    new String[]{"Netherlands", "Amsterdam", "nl", "Europe"},
//
                    new String[]{"Netherlands Antilles", "Willemstad", "nt", "America"},
//
                    new String[]{"New Zealand", "Wellington", "nz", "Oceania"},
//
                    new String[]{"Nicaragua", "Managua", "nu", "America"},
//
                    new String[]{"Niger", "Niamey", "ng", "Africa"},
//
                    new String[]{"Nigeria", "Abuja", "ni", "Africa"},
//
                    new String[]{"Niue", "Alofi", "ne", "Oceania"},
//
                    new String[]{"Norfolk Island", "Kingston", "nf", "Oceania"},
//
                    new String[]{"North Korea", "Pyongyang", "kn", "Asia"},
//
                    new String[]{"Northern Mariana Islands", "Saipan", "cq", "Oceania"},
//
                    new String[]{"Norway", "Oslo", "no", "Europe"},
//
                    new String[]{"Oman", "Muscat", "mu", "Asia"},
//
                    new String[]{"Pakistan", "Islamabad", "pk", "Asia"},
//
                    new String[]{"Palau", "Ngerulmud", "ps", "Oceania"},
//
                    new String[]{"Panama", "Panamá City", "pm", "America"},
//
                    new String[]{"Papua New Guinea", "Port Moresby", "pp", "Oceania"},
//
                    new String[]{"Paraguay", "Asunción", "pa", "America"},
//
                    new String[]{"Peru", "Lima", "pe", "America"},
//
                    new String[]{"Philippines", "Manila", "rp", "Asia"},
//
                    new String[]{"Pitcairn Islands", "Adamstown", "pc", "Oceania"},
//
                    new String[]{"Poland", "Warsaw", "pl", "Europe"},
//
                    new String[]{"Portugal", "Lisbon", "po", "Europe"},
//
                    new String[]{"Puerto Rico", "San Juan", "rq", "America"},
//
                    new String[]{"Qatar", "Doha", "qa", "Asia"},
//
                    new String[]{"Romania", "Bucharest ", "ro", "Europe"},
//
                    new String[]{"Russia", "Moscow", "rs", "Europe"},
//
                    new String[]{"Rwanda", "Kigali", "rw", "Africa"},
//
                    new String[]{"Saint Barthelemy", "Gustavia", "tb", "America"},
//
                    new String[]{"Saint Helena", "Jamestown", "sh", "Africa"},
//
                    new String[]{"Saint Kitts and Nevis", "Basseterre", "sc", "America"},
//
                    new String[]{"Saint Lucia", "Castries", "st", "America"},
//
                    new String[]{"Saint Vincent and the Grenadines", "Kingstown", "vc", "America"},
//
                    new String[]{"Samoa", "Apia", "ws", "Oceania"},
//
                    new String[]{"San Marino", "San Marino", "sm", "Europe"},
//
                    new String[]{"Sao Tome and Principe", "São Tomé", "tp", "Africa"},
//
                    new String[]{"Saudi Arabia", "Riyadh", "sa", "Asia"},
//
                    new String[]{"Senegal", "Dakar", "sg", "Africa"},
//
                    new String[]{"Serbia", "Belgrade", "ri", "Europe"},
//
                    new String[]{"Seychelles", "Victoria", "se", "Africa"},
//
                    new String[]{"Sierra Leone", "Freetown", "sl", "Africa"},
//
                    new String[]{"Singapore", "Singapore", "sn", "Asia"},
//
                    new String[]{"Sint Maarten", "Philipsburg", "sk", "America"},
//
                    new String[]{"Slovakia", "Bratislava", "lo", "Europe"},
//
                    new String[]{"Slovenia", "Ljubljana", "si", "Europe"},
//
                    new String[]{"Solomon Islands", "Honiara", "bp", "Oceania"},
//
                    new String[]{"Somalia", "Mogadishu", "so", "Africa"},
//
                    new String[]{"South Africa", "Pretoria", "sf", "Africa"},
//
                    new String[]{"South Georgia and the South Sandwich Islands", "Grytviken", "sx", "America"},
//
                    new String[]{"South Korea", "Seoul", "ks", "Asia"},
//
                    new String[]{"Spain", "Madrid", "sp", "Europe"},
//
                    new String[]{"Sri Lanka", "Colombo", "ce", "Asia"},
//
                    new String[]{"Sudan", "Khartoum", "su", "Africa"},
//
                    new String[]{"Suriname", "Paramaribo", "ns", "America"},
//
                    new String[]{"Swaziland", "Mbabane", "wz", "Africa"},
//
                    new String[]{"Sweden", "Stockholm", "sw", "Europe"},
//
                    new String[]{"Switzerland", "Berne", "sz", "Europe"},
//
                    new String[]{"Syria", "Damascus", "sy", "Asia"},
//
                    new String[]{"Taiwan", "Taipei", "tw", "Asia"},
//
                    new String[]{"Tajikistan", "Dushanbe", "ti", "Asia"},
//
                    new String[]{"Tanzania", "Dodoma", "tz", "Africa"},
//
                    new String[]{"Thailand", "Bangkok", "th", "Asia"},
//
                    new String[]{"Timor-Leste", "Dili", "tt", "Asia"},
//
                    new String[]{"Togo", "Lomé", "to", "Africa"},
//
                    new String[]{"Tokelau", "none", "tl", "Oceania"},
//
                    new String[]{"Tonga", "Nuku’alofa", "tn", "Oceania"},
//
                    new String[]{"Trinidad and Tobago", "Port-of-Spain", "td", "America"},
//
                    new String[]{"Tunisia", "Tunis", "ts", "Africa"},
//
                    new String[]{"Turkey", "Ankara", "tu", "Asia"},
//
                    new String[]{"Turkmenistan", "Ashkhabad", "tx", "Asia"},
//
                    new String[]{"Turks and Caicos Islands", "Cockburn Town", "tk", "America"},
//
                    new String[]{"Tuvalu", "Funafuti", "tv", "Oceania"},
//
                    new String[]{"Uganda", "Kampala", "ug", "Africa"},
//
                    new String[]{"Ukraine", "Kiev", "up", "Europe"},
//
                    new String[]{"United Arab Emirates", "Abu Dhabi ", "ae", "Asia"},
//
                    new String[]{"United Kingdom", "London", "uk", "Europe"},
//
                    new String[]{"United States", "Washington, DC", "us", "America"},
//
                    new String[]{"United States Virgin Islands", "Charlotte Amalie", "vq", "America"},
//
                    new String[]{"Uruguay", "Montevideo", "uy", "America"},
//
                    new String[]{"Uzbekistan", "Tashkent", "uz", "Asia"},
//
                    new String[]{"Vanuatu", "Vila", "nh", "Oceania"},
//
                    new String[]{"Vatican City", "The Vatican", "vt", "Europe"},
//
                    new String[]{"Venezuela", "Caracas", "ve", "America"},
//
                    new String[]{"Vietnam", "Hanoi", "vm", "Asia"},
//
                    new String[]{"Wallis and Futuna", "Mata-Utu", "wf", "America"},
//
                    new String[]{"Western Sahara", "none", "wi", "Africa"},
//
                    new String[]{"Yemen", "San’a", "ym", "Asia"},
//
                    new String[]{"Zambia", "Lusaka", "za", "Africa"},
//
                    new String[]{"Zimbabwe", "Harare", "zi", "Africa"}
            };

    public static String normalize(String resource_name) {
        String name = resource_name.toLowerCase();
        name = name.replace("-", " ");
        name = name.replace("(", "");
        name = name.replace(")", "");
        name = name.replace("'", "");
        name = name.replace(' ', '_');
        return name;
    }

    private static final HashMap<String, Integer> imageCache = new HashMap<String, Integer>(256);

    public static int getFlag(Context context, String countryName) {
        countryName = "flag_" + countryName;
        Integer resId = imageCache.get(countryName);
        if (resId != null) {
            return resId;
        }
        String name = normalize(countryName);
        resId = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
        imageCache.put(countryName, resId);
        return resId;
    }

    public static int getResourceByName(Context context, String name) {
        name = normalize(name);
        int resId = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
        return resId;
    }
}
