```json
{
  "settings": {
    "analysis": {
      "filter": {
        "turkish_stop": {
          "type":       "stop",
          "stopwords":  "_turkish_"
        },
        "turkish_lowercase": {
          "type":       "lowercase",
          "language":   "turkish"
        },
        "turkish_keywords": {
          "type":       "keyword_marker",
          "keywords":   []
        },
        "turkish_stemmer": {
          "type":       "stemmer",
          "language":   "turkish"
        }
      },
      "analyzer": {
        "turkish": {
          "tokenizer":  "standard",
          "filter": [
            "apostrophe",
            "turkish_lowercase",
            "turkish_stop",
            "turkish_keywords",
            "turkish_stemmer"
          ]
        }
      }
    }
  }
}

```

