package com.github.libliboom.wikipedia.data.stub

object FakeResponse {

  val fakeSummaryInfoResponse =
    """
    {
        "type": "standard",
        "title": "Google",
        "displaytitle": "Google",
        "namespace": {
            "id": 0,
            "text": ""
        },
        "wikibase_item": "Q95",
        "titles": {
            "canonical": "Google",
            "normalized": "Google",
            "display": "Google"
        },
        "pageid": 1092923,
        "thumbnail": {
            "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Googleplex_HQ_%28cropped%29.jpg/320px-Googleplex_HQ_%28cropped%29.jpg",
            "width": 320,
            "height": 234
        },
        "originalimage": {
            "source": "https://upload.wikimedia.org/wikipedia/commons/3/32/Googleplex_HQ_%28cropped%29.jpg",
            "width": 3024,
            "height": 2212
        },
        "lang": "en",
        "dir": "ltr",
        "revision": "1016388267",
        "tid": "c09a2110-9726-11eb-a145-439ff1855a9d",
        "timestamp": "2021-04-06T22:23:31Z",
        "description": "American technology company",
        "description_source": "local",
        "content_urls": {
            "desktop": {
                "page": "https://en.wikipedia.org/wiki/Google",
                "revisions": "https://en.wikipedia.org/wiki/Google?action=history",
                "edit": "https://en.wikipedia.org/wiki/Google?action=edit",
                "talk": "https://en.wikipedia.org/wiki/Talk:Google"
            },
            "mobile": {
                "page": "https://en.m.wikipedia.org/wiki/Google",
                "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Google",
                "edit": "https://en.m.wikipedia.org/wiki/Google?action=edit",
                "talk": "https://en.m.wikipedia.org/wiki/Talk:Google"
            }
        },
        "extract": "Google LLC is an American multinational technology company that specializes in Internet-related services and products, which include online advertising technologies, a search engine, cloud computing, software, and hardware. It is considered one of the five Big Tech companies alongside Amazon, Facebook, Apple, and Microsoft.",
        "extract_html": "<p><b>Google LLC</b> is an American multinational technology company that specializes in Internet-related services and products, which include online advertising technologies, a search engine, cloud computing, software, and hardware. It is considered one of the five Big Tech companies alongside Amazon, Facebook, Apple, and Microsoft.</p>"
    }
    """.trimIndent()

  val fakeRelateInfoResponse =
    """
    {
        "pages": [
            {
                "pageid": 19001,
                "ns": 0,
                "index": 15,
                "type": "standard",
                "title": "Microsoft",
                "displaytitle": "Microsoft",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q2283",
                "titles": {
                    "canonical": "Microsoft",
                    "normalized": "Microsoft",
                    "display": "Microsoft"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Building92microsoft.jpg/320px-Building92microsoft.jpg",
                    "width": 320,
                    "height": 213
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/3/30/Building92microsoft.jpg",
                    "width": 5184,
                    "height": 3456
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016214833",
                "tid": "821b7010-966d-11eb-95d8-ed0c4bc2205b",
                "timestamp": "2021-04-06T00:17:28Z",
                "description": "American technology company",
                "description_source": "local",
                "coordinates": {
                    "lat": 47.63972222,
                    "lon": -122.12833333
                },
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Microsoft",
                        "revisions": "https://en.wikipedia.org/wiki/Microsoft?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Microsoft?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Microsoft"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Microsoft",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Microsoft",
                        "edit": "https://en.m.wikipedia.org/wiki/Microsoft?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Microsoft"
                    }
                },
                "extract": "Microsoft Corporation is an American multinational technology company with headquarters in Redmond, Washington. It develops, manufactures, licenses, supports, and sells computer software, consumer electronics, personal computers, and related services. Its best known software products are the Microsoft Windows line of operating systems, the Microsoft Office suite, and the Internet Explorer and Edge web browsers. Its flagship hardware products are the Xbox video game consoles and the Microsoft Surface lineup of touchscreen personal computers. Microsoft ranked No. 21 in the 2020 Fortune 500 rankings of the largest United States corporations by total revenue; it was the world's largest software maker by revenue as of 2016. It is considered one of the Big Five companies in the U.S. information technology industry, along with Google, Apple, Amazon, and Facebook.",
                "extract_html": "<p><b>Microsoft Corporation</b> is an American multinational technology company with headquarters in Redmond, Washington. It develops, manufactures, licenses, supports, and sells computer software, consumer electronics, personal computers, and related services. Its best known software products are the Microsoft Windows line of operating systems, the Microsoft Office suite, and the Internet Explorer and Edge web browsers. Its flagship hardware products are the Xbox video game consoles and the Microsoft Surface lineup of touchscreen personal computers. Microsoft ranked No. 21 in the 2020 Fortune 500 rankings of the largest United States corporations by total revenue; it was the world's largest software maker by revenue as of 2016. It is considered one of the Big Five companies in the U.S. information technology industry, along with Google, Apple, Amazon, and Facebook.</p>",
                "normalizedtitle": "Microsoft"
            },
            {
                "pageid": 60903,
                "ns": 0,
                "index": 9,
                "type": "standard",
                "title": "Larry_Page",
                "displaytitle": "Larry Page",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q4934",
                "titles": {
                    "canonical": "Larry_Page",
                    "normalized": "Larry Page",
                    "display": "Larry Page"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg/278px-Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
                    "width": 278,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
                    "width": 1129,
                    "height": 1301
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016449629",
                "tid": "b7d696f0-976f-11eb-952e-cfacde8ff8aa",
                "timestamp": "2021-04-07T07:05:53Z",
                "description": "American business magnate and Internet entrepreneur",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Larry_Page",
                        "revisions": "https://en.wikipedia.org/wiki/Larry_Page?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Larry_Page?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Larry_Page"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Larry_Page",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Larry_Page",
                        "edit": "https://en.m.wikipedia.org/wiki/Larry_Page?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Larry_Page"
                    }
                },
                "extract": "Lawrence Edward Page is an American computer scientist and Internet entrepreneur. He is best known as one of the co-founders of Google along with Sergey Brin.",
                "extract_html": "<p><b>Lawrence Edward Page</b> is an American computer scientist and Internet entrepreneur. He is best known as one of the co-founders of Google along with Sergey Brin.</p>",
                "normalizedtitle": "Larry Page"
            },
            {
                "pageid": 60904,
                "ns": 0,
                "index": 19,
                "type": "standard",
                "title": "Sergey_Brin",
                "displaytitle": "Sergey Brin",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q92764",
                "titles": {
                    "canonical": "Sergey_Brin",
                    "normalized": "Sergey Brin",
                    "display": "Sergey Brin"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Sergey_Brin_cropped.jpg/245px-Sergey_Brin_cropped.jpg",
                    "width": 245,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/a/a2/Sergey_Brin_cropped.jpg",
                    "width": 638,
                    "height": 832
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1015370128",
                "tid": "d3d4bcc0-92e6-11eb-a7fa-2baa4930b677",
                "timestamp": "2021-04-01T02:27:11Z",
                "description": "Co-founder of Google",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Sergey_Brin",
                        "revisions": "https://en.wikipedia.org/wiki/Sergey_Brin?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Sergey_Brin?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Sergey_Brin"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Sergey_Brin",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Sergey_Brin",
                        "edit": "https://en.m.wikipedia.org/wiki/Sergey_Brin?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Sergey_Brin"
                    }
                },
                "extract": "Sergey Mikhaylovich Brin is an American computer scientist and Internet entrepreneur. Together with Larry Page, he co-founded Google. Brin was the president of Google's parent company, Alphabet Inc., until stepping down from the role on December 3, 2019. He and Page remain at Alphabet as co-founders, controlling shareholders, board members, and employees. As of January 2021, Brin is the 9th-richest person in the world, with an estimated net worth of US${'$'}75 billion.",
                "extract_html": "<p><b>Sergey Mikhaylovich Brin</b> is an American computer scientist and Internet entrepreneur. Together with Larry Page, he co-founded Google. Brin was the president of Google's parent company, Alphabet Inc., until stepping down from the role on December 3, 2019. He and Page remain at Alphabet as co-founders, controlling shareholders, board members, and employees. As of January 2021, Brin is the 9th-richest person in the world, with an estimated net worth of US${'$'}75 billion.</p>",
                "normalizedtitle": "Sergey Brin"
            },
            {
                "pageid": 188213,
                "ns": 0,
                "index": 7,
                "type": "standard",
                "title": "Yahoo!",
                "displaytitle": "Yahoo!",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q37093",
                "titles": {
                    "canonical": "Yahoo!",
                    "normalized": "Yahoo!",
                    "display": "Yahoo!"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/en/thumb/2/26/Yahoo_partial_screenshot_2017.png/320px-Yahoo_partial_screenshot_2017.png",
                    "width": 320,
                    "height": 182
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/en/2/26/Yahoo_partial_screenshot_2017.png",
                    "width": 418,
                    "height": 238
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016306486",
                "tid": "a8f25f40-96dc-11eb-9bbc-9f219e0297e3",
                "timestamp": "2021-04-06T13:33:14Z",
                "description": "Internet services provider",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Yahoo!",
                        "revisions": "https://en.wikipedia.org/wiki/Yahoo!?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Yahoo!?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Yahoo!"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Yahoo!",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Yahoo!",
                        "edit": "https://en.m.wikipedia.org/wiki/Yahoo!?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Yahoo!"
                    }
                },
                "extract": "Yahoo! is an American web services provider. It is headquartered in Sunnyvale, California and owned by Verizon Media, which acquired it in 2017 for ${'$'}4.48 billion.",
                "extract_html": "<p><b>Yahoo!</b> is an American web services provider. It is headquartered in Sunnyvale, California and owned by Verizon Media, which acquired it in 2017 for ${'$'}4.48 billion.</p>",
                "normalizedtitle": "Yahoo!"
            },
            {
                "pageid": 224584,
                "ns": 0,
                "index": 6,
                "type": "standard",
                "title": "Eric_Schmidt",
                "displaytitle": "Eric Schmidt",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q92747",
                "titles": {
                    "canonical": "Eric_Schmidt",
                    "normalized": "Eric Schmidt",
                    "display": "Eric Schmidt"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Eric_Schmidt_at_the_37th_G8_Summit_in_Deauville_037.jpg/239px-Eric_Schmidt_at_the_37th_G8_Summit_in_Deauville_037.jpg",
                    "width": 239,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/e/e5/Eric_Schmidt_at_the_37th_G8_Summit_in_Deauville_037.jpg",
                    "width": 2645,
                    "height": 3541
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1015863099",
                "tid": "c2513fc0-94dd-11eb-9a79-93e4dfc67cad",
                "timestamp": "2021-04-04T00:35:54Z",
                "description": "American software engineer and businessman",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Eric_Schmidt",
                        "revisions": "https://en.wikipedia.org/wiki/Eric_Schmidt?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Eric_Schmidt?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Eric_Schmidt"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Eric_Schmidt",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Eric_Schmidt",
                        "edit": "https://en.m.wikipedia.org/wiki/Eric_Schmidt?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Eric_Schmidt"
                    }
                },
                "extract": "Eric Emerson Schmidt is an American technology businessman and software engineer. He is known for being the CEO of Google from 2001 to 2011, executive chairman of Google from 2011 to 2015, executive chairman of Alphabet Inc. from 2015 to 2017, and Technical Advisor at Alphabet from 2017 to 2020.",
                "extract_html": "<p><b>Eric Emerson Schmidt</b> is an American technology businessman and software engineer. He is known for being the CEO of Google from 2001 to 2011, executive chairman of Google from 2011 to 2015, executive chairman of Alphabet Inc. from 2015 to 2017, and Technical Advisor at Alphabet from 2017 to 2020.</p>",
                "normalizedtitle": "Eric Schmidt"
            },
            {
                "pageid": 569005,
                "ns": 0,
                "index": 8,
                "type": "standard",
                "title": "Gmail",
                "displaytitle": "Gmail",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q9334",
                "titles": {
                    "canonical": "Gmail",
                    "normalized": "Gmail",
                    "display": "Gmail"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/en/thumb/c/c5/Gmail_screenshot.png/228px-Gmail_screenshot.png",
                    "width": 228,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/en/c/c5/Gmail_screenshot.png",
                    "width": 480,
                    "height": 674
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016302564",
                "tid": "ef434e40-96d8-11eb-8762-2fe60da14b7a",
                "timestamp": "2021-04-06T13:06:27Z",
                "description": "Email service developed by Google",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Gmail",
                        "revisions": "https://en.wikipedia.org/wiki/Gmail?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Gmail?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Gmail"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Gmail",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Gmail",
                        "edit": "https://en.m.wikipedia.org/wiki/Gmail?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Gmail"
                    }
                },
                "extract": "Gmail is a free email service developed by Google. Users can access Gmail on the web and using third-party programs that synchronize email content through POP or IMAP protocols. Gmail started as a limited beta release on April 1, 2004 and ended its testing phase on July 7, 2009. By October 2019, Gmail had 1.5 billion active users worldwide.",
                "extract_html": "<p><b>Gmail</b> is a free email service developed by Google. Users can access Gmail on the web and using third-party programs that synchronize email content through POP or IMAP protocols. Gmail started as a limited beta release on April 1, 2004 and ended its testing phase on July 7, 2009. By October 2019, Gmail had 1.5 billion active users worldwide.</p>",
                "normalizedtitle": "Gmail"
            },
            {
                "pageid": 1676048,
                "ns": 0,
                "index": 14,
                "type": "standard",
                "title": "Baidu",
                "displaytitle": "Baidu",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q14772",
                "titles": {
                    "canonical": "Baidu",
                    "normalized": "Baidu",
                    "display": "Baidu"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Baidu.svg/320px-Baidu.svg.png",
                    "width": 320,
                    "height": 109
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Baidu.svg/231px-Baidu.svg.png",
                    "width": 231,
                    "height": 79
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1015256160",
                "tid": "364943c0-9685-11eb-a551-0dd4fef34aa2",
                "timestamp": "2021-03-31T13:28:06Z",
                "description": "Chinese web services company",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Baidu",
                        "revisions": "https://en.wikipedia.org/wiki/Baidu?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Baidu?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Baidu"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Baidu",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Baidu",
                        "edit": "https://en.m.wikipedia.org/wiki/Baidu?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Baidu"
                    }
                },
                "extract": "Baidu, Inc. is a Chinese multinational technology company specializing in Internet-related services and products and artificial intelligence (AI), headquartered in Beijing's Haidian District. It is one of the largest AI and Internet companies in the world. The holding company of the group is incorporated in the Cayman Islands. Baidu was incorporated in January 2000 by Robin Li and Eric Xu. The Baidu search engine is currently the fourth largest website in the Alexa Internet rankings. Baidu has origins in RankDex, an earlier search engine developed by Robin Li in 1996, before he founded Baidu in 2000.",
                "extract_html": "<p><b>Baidu, Inc.</b> is a Chinese multinational technology company specializing in Internet-related services and products and artificial intelligence (AI), headquartered in Beijing's Haidian District. It is one of the largest AI and Internet companies in the world. The holding company of the group is incorporated in the Cayman Islands. Baidu was incorporated in January 2000 by Robin Li and Eric Xu. The Baidu search engine is currently the fourth largest website in the Alexa Internet rankings. Baidu has origins in RankDex, an earlier search engine developed by Robin Li in 1996, before he founded Baidu in 2000.</p>",
                "normalizedtitle": "Baidu"
            },
            {
                "pageid": 3524766,
                "ns": 0,
                "index": 13,
                "type": "standard",
                "title": "YouTube",
                "displaytitle": "YouTube",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q866",
                "titles": {
                    "canonical": "YouTube",
                    "normalized": "YouTube",
                    "display": "YouTube"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/en/thumb/1/1c/YouTube_homepage.png/320px-YouTube_homepage.png",
                    "width": 320,
                    "height": 253
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/en/1/1c/YouTube_homepage.png",
                    "width": 500,
                    "height": 395
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016452700",
                "tid": "d5bdfa50-9774-11eb-a672-1d0f20ee3639",
                "timestamp": "2021-04-07T07:42:01Z",
                "description": "Video-sharing service owned by Google",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/YouTube",
                        "revisions": "https://en.wikipedia.org/wiki/YouTube?action=history",
                        "edit": "https://en.wikipedia.org/wiki/YouTube?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:YouTube"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/YouTube",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/YouTube",
                        "edit": "https://en.m.wikipedia.org/wiki/YouTube?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:YouTube"
                    }
                },
                "extract": "YouTube is an American online video-sharing platform headquartered in San Bruno, California. The service, created in February 2005 by three former PayPal employees—Chad Hurley, Steve Chen, and Jawed Karim—was bought by Google in November 2006 for US${'$'}1.65 billion and now operates as one of the company's subsidiaries. YouTube is the second most-visited website after Google Search, according to Alexa Internet rankings.",
                "extract_html": "<p><b>YouTube</b> is an American online video-sharing platform headquartered in San Bruno, California. The service, created in February 2005 by three former PayPal employees—Chad Hurley, Steve Chen, and Jawed Karim—was bought by Google in November 2006 for US${'$'}1.65 billion and now operates as one of the company's subsidiaries. YouTube is the second most-visited website after Google Search, according to Alexa Internet rankings.</p>",
                "normalizedtitle": "YouTube"
            },
            {
                "pageid": 3660182,
                "ns": 0,
                "index": 1,
                "type": "standard",
                "title": "List_of_mergers_and_acquisitions_by_Alphabet",
                "displaytitle": "List of mergers and acquisitions by Alphabet",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q1930038",
                "titles": {
                    "canonical": "List_of_mergers_and_acquisitions_by_Alphabet",
                    "normalized": "List of mergers and acquisitions by Alphabet",
                    "display": "List of mergers and acquisitions by Alphabet"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Google_timeline.svg/279px-Google_timeline.svg.png",
                    "width": 279,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2a/Google_timeline.svg/512px-Google_timeline.svg.png",
                    "width": 512,
                    "height": 588
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016169974",
                "tid": "8d994720-9643-11eb-b0ee-4d6ceda96c5e",
                "timestamp": "2021-04-05T19:17:00Z",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/List_of_mergers_and_acquisitions_by_Alphabet",
                        "revisions": "https://en.wikipedia.org/wiki/List_of_mergers_and_acquisitions_by_Alphabet?action=history",
                        "edit": "https://en.wikipedia.org/wiki/List_of_mergers_and_acquisitions_by_Alphabet?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:List_of_mergers_and_acquisitions_by_Alphabet"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/List_of_mergers_and_acquisitions_by_Alphabet",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/List_of_mergers_and_acquisitions_by_Alphabet",
                        "edit": "https://en.m.wikipedia.org/wiki/List_of_mergers_and_acquisitions_by_Alphabet?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:List_of_mergers_and_acquisitions_by_Alphabet"
                    }
                },
                "extract": "Google is a computer software and a web search engine company that acquired, on average, more than one company per week in 2010 and 2011. The table below is an incomplete list of acquisitions, with each acquisition listed being for the respective company in its entirety, unless otherwise specified. The acquisition date listed is the date of the agreement between Google and the acquisition subject. As Google is headquartered in the United States, acquisition is listed in US dollars. If the price of an acquisition is unlisted, then it is undisclosed. If the Google service that is derived from the acquired company is known, then it is also listed here. Google itself was re-organized into a subsidiary of a larger holding company known as Alphabet Inc. in 2015.",
                "extract_html": "<p>Google is a computer software and a web search engine company that acquired, on average, more than one company per week in 2010 and 2011. The table below is an incomplete list of acquisitions, with each acquisition listed being for the respective company in its entirety, unless otherwise specified. The acquisition date listed is the date of the agreement between Google and the acquisition subject. As Google is headquartered in the United States, acquisition is listed in US dollars. If the price of an acquisition is unlisted, then it is undisclosed. If the Google service that is derived from the acquired company is known, then it is also listed here. Google itself was re-organized into a subsidiary of a larger holding company known as Alphabet Inc. in 2015.</p>",
                "normalizedtitle": "List of mergers and acquisitions by Alphabet"
            },
            {
                "pageid": 4338696,
                "ns": 0,
                "index": 5,
                "type": "standard",
                "title": "History_of_Google",
                "displaytitle": "History of Google",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q1145634",
                "titles": {
                    "canonical": "History_of_Google",
                    "normalized": "History of Google",
                    "display": "History of Google"
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1014010690",
                "tid": "d4067b20-92e6-11eb-9cd6-15fb531c66d2",
                "timestamp": "2021-03-24T17:48:10Z",
                "description": "Overview of the history of Google",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/History_of_Google",
                        "revisions": "https://en.wikipedia.org/wiki/History_of_Google?action=history",
                        "edit": "https://en.wikipedia.org/wiki/History_of_Google?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:History_of_Google"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/History_of_Google",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/History_of_Google",
                        "edit": "https://en.m.wikipedia.org/wiki/History_of_Google?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:History_of_Google"
                    }
                },
                "extract": "Google was officially launched in 1998 by Larry Page and Sergey Brin to market Google Search, which has become the most used web-based search engine. Larry Page and Sergey Brin, students at Stanford University in California, developed a search algorithm at first known as \"BackRub\" in 1996, with the help of Scott Hassan and Alan Steremberg. The search engine soon proved successful and the expanding company moved several times, finally settling at Mountain View in 2003. This marked a phase of rapid growth, with the company making its initial public offering in 2004 and quickly becoming one of the world's largest media companies. The company launched Google News in 2002, Gmail in 2004, Google Maps in 2005, Google Chrome in 2008, and the social network known as Google+ in 2011, in addition to many other products. In 2015, Google became the main subsidiary of the holding company Alphabet Inc.",
                "extract_html": "<p><b>Google</b> was officially launched in 1998 by Larry Page and Sergey Brin to market Google Search, which has become the most used web-based search engine. Larry Page and Sergey Brin, students at Stanford University in California, developed a search algorithm at first known as \"BackRub\" in 1996, with the help of Scott Hassan and Alan Steremberg. The search engine soon proved successful and the expanding company moved several times, finally settling at Mountain View in 2003. This marked a phase of rapid growth, with the company making its initial public offering in 2004 and quickly becoming one of the world's largest media companies. The company launched Google News in 2002, Gmail in 2004, Google Maps in 2005, Google Chrome in 2008, and the social network known as Google+ in 2011, in addition to many other products. In 2015, Google became the main subsidiary of the holding company Alphabet Inc.</p>",
                "normalizedtitle": "History of Google"
            },
            {
                "pageid": 9874319,
                "ns": 0,
                "index": 11,
                "type": "standard",
                "title": "Criticism_of_Google",
                "displaytitle": "Criticism of Google",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q2628236",
                "titles": {
                    "canonical": "Criticism_of_Google",
                    "normalized": "Criticism of Google",
                    "display": "Criticism of Google"
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1015508174",
                "tid": "858c0c70-9783-11eb-857f-17529da14f2b",
                "timestamp": "2021-04-01T21:42:12Z",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Criticism_of_Google",
                        "revisions": "https://en.wikipedia.org/wiki/Criticism_of_Google?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Criticism_of_Google?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Criticism_of_Google"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Criticism_of_Google",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Criticism_of_Google",
                        "edit": "https://en.m.wikipedia.org/wiki/Criticism_of_Google?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Criticism_of_Google"
                    }
                },
                "extract": "\nCriticism of Google includes concern for tax avoidance, misuse and manipulation of search results, its use of others' intellectual property, concerns that its compilation of data may violate people's privacy and collaboration with the US military on Google Earth to spy on users, censorship of search results and content, and the energy consumption of its servers as well as concerns over traditional business issues such as monopoly, restraint of trade, antitrust, \"idea borrowing\", indexing and presenting false information and propaganda in search results, and being an \"Ideological Echo Chamber\".",
                "extract_html": "<p>\n<b>Criticism of Google</b> includes concern for tax avoidance, misuse and manipulation of search results, its use of others' intellectual property, concerns that its compilation of data may violate people's privacy and collaboration with the US military on Google Earth to spy on users, censorship of search results and content, and the energy consumption of its servers as well as concerns over traditional business issues such as monopoly, restraint of trade, antitrust, \"idea borrowing\", indexing and presenting false information and propaganda in search results, and being an \"Ideological Echo Chamber\".</p>",
                "normalizedtitle": "Criticism of Google"
            },
            {
                "pageid": 12610483,
                "ns": 0,
                "index": 20,
                "type": "standard",
                "title": "Android_(operating_system)",
                "displaytitle": "Android (operating system)",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q94",
                "titles": {
                    "canonical": "Android_(operating_system)",
                    "normalized": "Android (operating system)",
                    "display": "Android (operating system)"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Pixel_4a_Android_11_Launcher.png/147px-Pixel_4a_Android_11_Launcher.png",
                    "width": 147,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/7/71/Pixel_4a_Android_11_Launcher.png",
                    "width": 1080,
                    "height": 2340
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1015702178",
                "tid": "72908110-979b-11eb-a93c-f1b1cb2ce4b5",
                "timestamp": "2021-04-03T00:46:29Z",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Android_(operating_system)",
                        "revisions": "https://en.wikipedia.org/wiki/Android_(operating_system)?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Android_(operating_system)?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Android_(operating_system)"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Android_(operating_system)",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Android_(operating_system)",
                        "edit": "https://en.m.wikipedia.org/wiki/Android_(operating_system)?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Android_(operating_system)"
                    }
                },
                "extract": "Android is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smartphones and tablets. Android is developed by a consortium of developers known as the Open Handset Alliance and commercially sponsored by Google. It was unveiled in November 2007, with the first commercial Android device launched in September 2008.",
                "extract_html": "<p><b>Android</b> is a mobile operating system based on a modified version of the Linux kernel and other open source software, designed primarily for touchscreen mobile devices such as smartphones and tablets. Android is developed by a consortium of developers known as the Open Handset Alliance and commercially sponsored by Google. It was unveiled in November 2007, with the first commercial Android device launched in September 2008.</p>",
                "normalizedtitle": "Android (operating system)"
            },
            {
                "pageid": 16709162,
                "ns": 0,
                "index": 12,
                "type": "standard",
                "title": "Tencent",
                "displaytitle": "Tencent",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q860580",
                "titles": {
                    "canonical": "Tencent",
                    "normalized": "Tencent",
                    "display": "Tencent"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/TencentHQ2020.jpg/240px-TencentHQ2020.jpg",
                    "width": 240,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/b/ba/TencentHQ2020.jpg",
                    "width": 3024,
                    "height": 4032
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016061632",
                "tid": "885deab0-95ce-11eb-b934-ed3a4b1369f7",
                "timestamp": "2021-04-05T05:19:29Z",
                "description": "Chinese internet conglomerate",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Tencent",
                        "revisions": "https://en.wikipedia.org/wiki/Tencent?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Tencent?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Tencent"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Tencent",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Tencent",
                        "edit": "https://en.m.wikipedia.org/wiki/Tencent?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Tencent"
                    }
                },
                "extract": "Tencent Holdings Ltd., also known as Tencent, is a Chinese multinational technology conglomerate holding company. Founded in 1998, its subsidiaries globally market various Internet-related services and products, including in entertainment, artificial intelligence, and other technology. Its twin-skyscraper headquarters, Tencent Seafront Towers are based in the Nanshan District of Shenzhen.",
                "extract_html": "<p><b>Tencent Holdings Ltd.</b>, also known as <b>Tencent</b>, is a Chinese multinational technology conglomerate holding company. Founded in 1998, its subsidiaries globally market various Internet-related services and products, including in entertainment, artificial intelligence, and other technology. Its twin-skyscraper headquarters, Tencent Seafront Towers are based in the Nanshan District of Shenzhen.</p>",
                "normalizedtitle": "Tencent"
            },
            {
                "pageid": 18619278,
                "ns": 0,
                "index": 16,
                "type": "standard",
                "title": "Verizon_Communications",
                "displaytitle": "Verizon Communications",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q467752",
                "titles": {
                    "canonical": "Verizon_Communications",
                    "normalized": "Verizon Communications",
                    "display": "Verizon Communications"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/Verizon_Building_%288156005279%29.jpg/240px-Verizon_Building_%288156005279%29.jpg",
                    "width": 240,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/d/d6/Verizon_Building_%288156005279%29.jpg",
                    "width": 2592,
                    "height": 3456
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1015625612",
                "tid": "29c57660-9657-11eb-95a0-93695fb48b30",
                "timestamp": "2021-04-02T15:18:33Z",
                "description": "American communications company",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Verizon_Communications",
                        "revisions": "https://en.wikipedia.org/wiki/Verizon_Communications?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Verizon_Communications?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Verizon_Communications"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Verizon_Communications",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Verizon_Communications",
                        "edit": "https://en.m.wikipedia.org/wiki/Verizon_Communications?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Verizon_Communications"
                    }
                },
                "extract": "Verizon Communications Inc. is an American multinational telecommunications conglomerate and a corporate component of the Dow Jones Industrial Average. The company is based at 1095 Avenue of the Americas in Midtown Manhattan, New York City, but is incorporated in Delaware.",
                "extract_html": "<p><b>Verizon Communications Inc.</b> is an American multinational telecommunications conglomerate and a corporate component of the Dow Jones Industrial Average. The company is based at 1095 Avenue of the Americas in Midtown Manhattan, New York City, but is incorporated in Delaware.</p>",
                "normalizedtitle": "Verizon Communications"
            },
            {
                "pageid": 19321623,
                "ns": 0,
                "index": 18,
                "type": "standard",
                "title": "Fitbit",
                "displaytitle": "Fitbit",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q5455414",
                "titles": {
                    "canonical": "Fitbit",
                    "normalized": "Fitbit",
                    "display": "Fitbit"
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1014921628",
                "tid": "186cf6f0-970f-11eb-a7fa-2baa4930b677",
                "timestamp": "2021-03-29T19:30:24Z",
                "description": "Company producing activity trackers",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Fitbit",
                        "revisions": "https://en.wikipedia.org/wiki/Fitbit?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Fitbit?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Fitbit"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Fitbit",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Fitbit",
                        "edit": "https://en.m.wikipedia.org/wiki/Fitbit?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Fitbit"
                    }
                },
                "extract": "Fitbit, Inc. is an American consumer electronics and fitness company headquartered in San Francisco, California. Its products are activity trackers, smartwatches, wireless-enabled wearable technology devices that measure data such as the number of steps walked, heart rate, quality of sleep, steps climbed, and other personal metrics involved in fitness. Before October 2007, the company was previously named Healthy Metrics Research, Inc. While these devices appear to increase physical activities, there is little evidence that they improve health outcomes. In 2019, Google announced its intention to buy Fitbit for ${'$'}2.1 billion. The transaction was completed in January 2021 following regulatory approvals in the United States and Europe.",
                "extract_html": "<p><b>Fitbit, Inc.</b> is an American consumer electronics and fitness company headquartered in San Francisco, California. Its products are activity trackers, smartwatches, wireless-enabled wearable technology devices that measure data such as the number of steps walked, heart rate, quality of sleep, steps climbed, and other personal metrics involved in fitness. Before October 2007, the company was previously named Healthy Metrics Research, Inc. While these devices appear to increase physical activities, there is little evidence that they improve health outcomes. In 2019, Google announced its intention to buy Fitbit for ${'$'}2.1 billion. The transaction was completed in January 2021 following regulatory approvals in the United States and Europe.</p>",
                "normalizedtitle": "Fitbit"
            },
            {
                "pageid": 25173473,
                "ns": 0,
                "index": 4,
                "type": "standard",
                "title": "Sundar_Pichai",
                "displaytitle": "Sundar Pichai",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q3503829",
                "titles": {
                    "canonical": "Sundar_Pichai",
                    "normalized": "Sundar Pichai",
                    "display": "Sundar Pichai"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Sundar_Pichai_WEF_2020.png/234px-Sundar_Pichai_WEF_2020.png",
                    "width": 234,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/6/6b/Sundar_Pichai_WEF_2020.png",
                    "width": 461,
                    "height": 629
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1014617129",
                "tid": "7bab6740-9784-11eb-accf-77b83616a5c4",
                "timestamp": "2021-03-28T03:58:43Z",
                "description": "Indian-American engineer and business executive",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Sundar_Pichai",
                        "revisions": "https://en.wikipedia.org/wiki/Sundar_Pichai?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Sundar_Pichai?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Sundar_Pichai"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Sundar_Pichai",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Sundar_Pichai",
                        "edit": "https://en.m.wikipedia.org/wiki/Sundar_Pichai?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Sundar_Pichai"
                    }
                },
                "extract": "Pichai Sundararajan, better known as Sundar Pichai, is an Indian-American business executive. He is the chief executive officer (CEO) of Alphabet Inc. and its subsidiary Google.",
                "extract_html": "<p><b>Pichai Sundararajan</b>, better known as <b>Sundar Pichai</b>, is an Indian-American business executive. He is the chief executive officer (CEO) of Alphabet Inc. and its subsidiary Google.</p>",
                "normalizedtitle": "Sundar Pichai"
            },
            {
                "pageid": 25818648,
                "ns": 0,
                "index": 10,
                "type": "standard",
                "title": "David_Drummond_(businessman)",
                "displaytitle": "David Drummond (businessman)",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q5233079",
                "titles": {
                    "canonical": "David_Drummond_(businessman)",
                    "normalized": "David Drummond (businessman)",
                    "display": "David Drummond (businessman)"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/DavidDrummond2010.jpg/320px-DavidDrummond2010.jpg",
                    "width": 320,
                    "height": 170
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/3/30/DavidDrummond2010.jpg",
                    "width": 1392,
                    "height": 739
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "999709815",
                "tid": "d507be80-92e6-11eb-805a-6913cd78a3cd",
                "timestamp": "2021-01-11T15:29:19Z",
                "description": "American business executive and lawyer",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/David_Drummond_(businessman)",
                        "revisions": "https://en.wikipedia.org/wiki/David_Drummond_(businessman)?action=history",
                        "edit": "https://en.wikipedia.org/wiki/David_Drummond_(businessman)?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:David_Drummond_(businessman)"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/David_Drummond_(businessman)",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/David_Drummond_(businessman)",
                        "edit": "https://en.m.wikipedia.org/wiki/David_Drummond_(businessman)?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:David_Drummond_(businessman)"
                    }
                },
                "extract": "David Carl Drummond is an American business executive and lawyer. He served as senior vice president (SVP) of corporate development and chief legal officer (CLO) for Alphabet Inc., and, formerly, for its subsidiary, Google. Prior to joining Google, in 2002, Drummond was a partner at law firm Wilson Sonsini Goodrich & Rosati and then chief financial officer of software company SmartForce. Drummond retired from Alphabet on January 31, 2020.",
                "extract_html": "<p><b>David Carl Drummond</b> is an American business executive and lawyer. He served as senior vice president (SVP) of corporate development and chief legal officer (CLO) for Alphabet Inc., and, formerly, for its subsidiary, Google. Prior to joining Google, in 2002, Drummond was a partner at law firm Wilson Sonsini Goodrich &amp; Rosati and then chief financial officer of software company SmartForce. Drummond retired from Alphabet on January 31, 2020.</p>",
                "normalizedtitle": "David Drummond (businessman)"
            },
            {
                "pageid": 32058867,
                "ns": 0,
                "index": 17,
                "type": "standard",
                "title": "WhatsApp",
                "displaytitle": "WhatsApp",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q1049511",
                "titles": {
                    "canonical": "WhatsApp",
                    "normalized": "WhatsApp",
                    "display": "WhatsApp"
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/WhatsApp.svg/319px-WhatsApp.svg.png",
                    "width": 319,
                    "height": 320
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/WhatsApp.svg/662px-WhatsApp.svg.png",
                    "width": 662,
                    "height": 664
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016139191",
                "tid": "482eee10-9738-11eb-a20b-61181b47f30b",
                "timestamp": "2021-04-05T16:07:50Z",
                "description": "Messaging and VoIP service by Facebook",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/WhatsApp",
                        "revisions": "https://en.wikipedia.org/wiki/WhatsApp?action=history",
                        "edit": "https://en.wikipedia.org/wiki/WhatsApp?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:WhatsApp"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/WhatsApp",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/WhatsApp",
                        "edit": "https://en.m.wikipedia.org/wiki/WhatsApp?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:WhatsApp"
                    }
                },
                "extract": "WhatsApp Messenger, or simply WhatsApp, is an American freeware, cross-platform centralized messaging and voice-over-IP (VoIP) service owned by Facebook, Inc. It allows users to send text messages and voice messages, make voice and video calls, and share images, documents, user locations, and other content. WhatsApp's client application runs on mobile devices but is also accessible from desktop computers, as long as the user's mobile device remains connected to the Internet while they use the desktop app. The service requires each user to provide a standard cellular mobile telephone number for registering with the service. In January 2018, WhatsApp released a standalone business app targeted at small business owners, called WhatsApp Business, to allow companies to communicate with customers who use the standard WhatsApp client.",
                "extract_html": "<p><b>WhatsApp Messenger</b>, or simply <b>WhatsApp</b>, is an American freeware, cross-platform centralized messaging and voice-over-IP (VoIP) service owned by Facebook, Inc. It allows users to send text messages and voice messages, make voice and video calls, and share images, documents, user locations, and other content. WhatsApp's client application runs on mobile devices but is also accessible from desktop computers, as long as the user's mobile device remains connected to the Internet while they use the desktop app. The service requires each user to provide a standard cellular mobile telephone number for registering with the service. In January 2018, WhatsApp released a standalone business app targeted at small business owners, called WhatsApp Business, to allow companies to communicate with customers who use the standard WhatsApp client.</p>",
                "normalizedtitle": "WhatsApp"
            },
            {
                "pageid": 43201365,
                "ns": 0,
                "index": 2,
                "type": "standard",
                "title": "CapitalG",
                "displaytitle": "CapitalG",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q18151794",
                "titles": {
                    "canonical": "CapitalG",
                    "normalized": "CapitalG",
                    "display": "CapitalG"
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1013476310",
                "tid": "358c2b30-9399-11eb-bec7-7de883b87de0",
                "timestamp": "2021-03-21T20:38:17Z",
                "description": "Private equity firm under Alphabet Inc.",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/CapitalG",
                        "revisions": "https://en.wikipedia.org/wiki/CapitalG?action=history",
                        "edit": "https://en.wikipedia.org/wiki/CapitalG?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:CapitalG"
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/CapitalG",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/CapitalG",
                        "edit": "https://en.m.wikipedia.org/wiki/CapitalG?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:CapitalG"
                    }
                },
                "extract": "CapitalG is a private equity firm under Alphabet Inc. Founded in 2013, it focuses on larger, growth-stage technology companies, and invests for profit rather than strategically for Google. In addition to capital investment, CapitalG's approach includes giving portfolio companies access to Google's people, knowledge, and culture to support the companies' growth and offer them guidance. Since 2013, CapitalG has invested in over 25 companies, in areas such as big data, financial technology, security, and e-learning.",
                "extract_html": "<p><b>CapitalG</b> is a private equity firm under Alphabet Inc. Founded in 2013, it focuses on larger, growth-stage technology companies, and invests for profit rather than strategically for Google. In addition to capital investment, CapitalG's approach includes giving portfolio companies access to Google's people, knowledge, and culture to support the companies' growth and offer them guidance. Since 2013, CapitalG has invested in over 25 companies, in areas such as big data, financial technology, security, and e-learning.</p>",
                "normalizedtitle": "CapitalG"
            },
            {
                "pageid": 47489893,
                "ns": 0,
                "index": 3,
                "type": "standard",
                "title": "Alphabet_Inc.",
                "displaytitle": "Alphabet Inc.",
                "namespace": {
                    "id": 0,
                    "text": ""
                },
                "wikibase_item": "Q20800404",
                "titles": {
                    "canonical": "Alphabet_Inc.",
                    "normalized": "Alphabet Inc.",
                    "display": "Alphabet Inc."
                },
                "thumbnail": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Googleplex_HQ_%28cropped%29.jpg/320px-Googleplex_HQ_%28cropped%29.jpg",
                    "width": 320,
                    "height": 234
                },
                "originalimage": {
                    "source": "https://upload.wikimedia.org/wikipedia/commons/3/32/Googleplex_HQ_%28cropped%29.jpg",
                    "width": 3024,
                    "height": 2212
                },
                "lang": "en",
                "dir": "ltr",
                "revision": "1016264798",
                "tid": "7651dd70-96ac-11eb-90ab-db44f57f3f0f",
                "timestamp": "2021-04-06T07:48:15Z",
                "description": "American multinational conglomerate",
                "description_source": "local",
                "content_urls": {
                    "desktop": {
                        "page": "https://en.wikipedia.org/wiki/Alphabet_Inc.",
                        "revisions": "https://en.wikipedia.org/wiki/Alphabet_Inc.?action=history",
                        "edit": "https://en.wikipedia.org/wiki/Alphabet_Inc.?action=edit",
                        "talk": "https://en.wikipedia.org/wiki/Talk:Alphabet_Inc."
                    },
                    "mobile": {
                        "page": "https://en.m.wikipedia.org/wiki/Alphabet_Inc.",
                        "revisions": "https://en.m.wikipedia.org/wiki/Special:History/Alphabet_Inc.",
                        "edit": "https://en.m.wikipedia.org/wiki/Alphabet_Inc.?action=edit",
                        "talk": "https://en.m.wikipedia.org/wiki/Talk:Alphabet_Inc."
                    }
                },
                "extract": "Alphabet Inc. is an American multinational conglomerate headquartered in Mountain View, California. It was created through a restructuring of Google on October 2, 2015, and became the parent company of Google and several former Google subsidiaries. The two co-founders of Google remained as controlling shareholders, board members, and employees at Alphabet. Alphabet is the world's fourth-largest technology company by revenue and one of the world's most valuable companies.",
                "extract_html": "<p><b>Alphabet Inc.</b> is an American multinational conglomerate headquartered in Mountain View, California. It was created through a restructuring of Google on October 2, 2015, and became the parent company of Google and several former Google subsidiaries. The two co-founders of Google remained as controlling shareholders, board members, and employees at Alphabet. Alphabet is the world's fourth-largest technology company by revenue and one of the world's most valuable companies.</p>",
                "normalizedtitle": "Alphabet Inc."
            }
        ]
    }
    """.trimIndent()
}
