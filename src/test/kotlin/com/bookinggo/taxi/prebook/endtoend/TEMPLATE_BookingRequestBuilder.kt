package com.bookinggo.taxi.prebook.endtoend


object TEMPLATE_BookingRequestBuilder {

    @JvmStatic
    fun bookingRequestPayload(searchResultId: String, customerAccountId: String) = """

        {
       "searchResultId": "$searchResultId",
        "userDetails": {
        "customerAccountId": "$customerAccountId",
        "firstName": "tom",
        "phone": "13900000001",
        "email": "tom@booking.com"
    }
    }
    """
}


