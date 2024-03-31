package org.example.webscraping

import org.w3c.dom.Document
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class Main {
    static void main(String[] args) {
        println("hellor")
        Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Dengue").get()
        println(doc.getElementsContainingOwnText("as pessoas infectadas com o vírus da"))
//    Operation operation = new Operation()
    }
}
