package com.bookinggo.taxi.prebook.endtoend


object TEMPLATE_CustomerCancelBookingBuilder {

    @JvmStatic
    fun customerCancelBookingPayload() = """
{
    "action": "CANCEL",
    "cancellationRequest": {
        "device":{
            "imei":"986521254170365",
            "suuid":"suuid"
        }
    }
}
"""}


