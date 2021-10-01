package com.df.mykmmapplication

import kotlin.test.Test
import kotlin.test.assertNotNull

class AnswerTest {

    @Test
    fun blah() {
        val json = """{
    "ApiVersion": "2.0",
    "AnswerEntitySets": [
        {
            "Rank": {
                "Confidence": 0.8686951
            },
            "ResultSets": [
                {
                    "ContentSources": [
                        "Exchange"
                    ],
                    "Results": [
                        {
                            "Id": "6b793705-c326-44e0-bcfc-10935a700aa1",
                            "ContentSource": "Exchange",
                            "ReferenceId": "2dc43456-48aa-43f3-84da-be3b67273a96.1000.1",
                            "Rank": 1,
                            "Source": {
                                "Confidence": 100.0,
                                "Order": 1,
                                "Id": 4654654687,
                                "OrganizerAvailability": "Free",
                                "AttendeeAvailability": [],
                                "Locations": [],
                                "MeetingTimeSlot": {
                                    "Start": {
                                        "DateTime": "2020-04-27T21:30:00",
                                        "TimeZone": "UTC"
                                    },
                                    "End": {
                                        "DateTime": "2020-04-27T22:00:00",
                                        "TimeZone": "UTC"
                                    }
                                }
                            },
                            "Type": "MeetingProposal"
                        },
                        {
                            "Id": "6ce2840d-cb5a-49cd-ac34-6a4006f8a21b",
                            "ContentSource": "Exchange",
                            "ReferenceId": "2dc43456-48aa-43f3-84da-be3b67273a96.1000.2",
                            "Rank": 2,
                            "Source": {
                                "Confidence": 100.0,
                                "Order": 2,
                                "OrganizerAvailability": "Free",
                                "AttendeeAvailability": [],
                                "Locations": [],
                                "MeetingTimeSlot": {
                                    "Start": {
                                        "DateTime": "2020-04-27T18:00:00",
                                        "TimeZone": "UTC"
                                    },
                                    "End": {
                                        "DateTime": "2020-04-27T18:30:00",
                                        "TimeZone": "UTC"
                                    }
                                }
                            },
                            "Type": "MeetingProposal"
                        },
                        {
                            "Id": "29ac0b07-52e7-4e96-90c6-2d6314e61c6a",
                            "ContentSource": "Exchange",
                            "ReferenceId": "2dc43456-48aa-43f3-84da-be3b67273a96.1000.3",
                            "Rank": 3,
                            "Source": {
                                "Confidence": 100.0,
                                "Order": 3,
                                "OrganizerAvailability": "Free",
                                "AttendeeAvailability": [],
                                "Locations": [],
                                "MeetingTimeSlot": {
                                    "Start": {
                                        "DateTime": "2020-04-27T20:30:00",
                                        "TimeZone": "UTC"
                                    },
                                    "End": {
                                        "DateTime": "2020-04-27T21:00:00",
                                        "TimeZone": "UTC"
                                    }
                                }
                            },
                            "Type": "MeetingProposal"
                        },
                        {
                            "Id": "307e8b3d-4b23-4531-9b20-6bda2a685245",
                            "ContentSource": "Exchange",
                            "ReferenceId": "2dc43456-48aa-43f3-84da-be3b67273a96.1000.4",
                            "Rank": 4,
                            "Source": {
                                "Confidence": 100.0,
                                "Order": 4,
                                "OrganizerAvailability": "Free",
                                "AttendeeAvailability": [],
                                "Locations": [],
                                "MeetingTimeSlot": {
                                    "Start": {
                                        "DateTime": "2020-04-28T18:00:00",
                                        "TimeZone": "UTC"
                                    },
                                    "End": {
                                        "DateTime": "2020-04-28T18:30:00",
                                        "TimeZone": "UTC"
                                    }
                                }
                            },
                            "Type": "MeetingProposal"
                        },
                        {
                            "Id": "9c2a66db-c269-4292-862a-c4842831e5b0",
                            "ContentSource": "Exchange",
                            "ReferenceId": "2dc43456-48aa-43f3-84da-be3b67273a96.1000.5",
                            "Rank": 5,
                            "Source": {
                                "Confidence": 100.0,
                                "Order": 5,
                                "OrganizerAvailability": "Free",
                                "AttendeeAvailability": [],
                                "Locations": [],
                                "MeetingTimeSlot": {
                                    "Start": {
                                        "DateTime": "2020-04-29T21:30:00",
                                        "TimeZone": "UTC"
                                    },
                                    "End": {
                                        "DateTime": "2020-04-29T22:00:00",
                                        "TimeZone": "UTC"
                                    }
                                }
                            },
                            "Type": "MeetingProposal"
                        }
                    ],
                    "Total": 5,
                    "MoreResultsAvailable": false,
                    "Rank": 0
                }
            ],
            "EntityType": "MeetingProposal",
            "Properties": {
                "start_time": "2020-04-27T15:24:43.5844105Z",
                "end_time": "2020-05-01T15:24:43.5844105Z",
                "HasParseException": null
            }
        }
    ],
    "Actions": [
        {
            "MeetingTitle": "Block time",
            "Attendees": [],
            "MeetingTime": {
                "CandidateEntities": [
                    {
                        "EntityId": "6b793705-c326-44e0-bcfc-10935a700aa1",
                        "NextTurnResolutionToken": "{\"StartTimestamp\":\"2020-04-27T21:30:00\",\"StartTimezone\":\"UTC\",\"EndTimestamp\":\"2020-04-27T22:00:00\",\"EndTimezone\":\"UTC\",\"Type\":1}"
                    },
                    {
                        "EntityId": "6ce2840d-cb5a-49cd-ac34-6a4006f8a21b",
                        "NextTurnResolutionToken": "{\"StartTimestamp\":\"2020-04-27T18:00:00\",\"StartTimezone\":\"UTC\",\"EndTimestamp\":\"2020-04-27T18:30:00\",\"EndTimezone\":\"UTC\",\"Type\":1}"
                    },
                    {
                        "EntityId": "29ac0b07-52e7-4e96-90c6-2d6314e61c6a",
                        "NextTurnResolutionToken": "{\"StartTimestamp\":\"2020-04-27T20:30:00\",\"StartTimezone\":\"UTC\",\"EndTimestamp\":\"2020-04-27T21:00:00\",\"EndTimezone\":\"UTC\",\"Type\":1}"
                    },
                    {
                        "EntityId": "307e8b3d-4b23-4531-9b20-6bda2a685245",
                        "NextTurnResolutionToken": "{\"StartTimestamp\":\"2020-04-28T18:00:00\",\"StartTimezone\":\"UTC\",\"EndTimestamp\":\"2020-04-28T18:30:00\",\"EndTimezone\":\"UTC\",\"Type\":1}"
                    },
                    {
                        "EntityId": "9c2a66db-c269-4292-862a-c4842831e5b0",
                        "NextTurnResolutionToken": "{\"StartTimestamp\":\"2020-04-29T21:30:00\",\"StartTimezone\":\"UTC\",\"EndTimestamp\":\"2020-04-29T22:00:00\",\"EndTimezone\":\"UTC\",\"Type\":1}"
                    }
                ],
                "RawQueryParse": "Create a meeting",
                "EntityResolutionState": "EntitiesAvailable"
            },
            "MeetingRoom": {
                "PrerequisitePropertiesToResolve": [
                    "Attendees",
                    "MeetingTime"
                ],
                "AsyncResolutionToken": "",
                "RawQueryParse": "null"
            },
            "ActionId": "CreateMeeting",
            "ActionKind": "Meeting"
        },
        {
      "ActionKind": "Communication",
      "ActionId": "MakeCall",
      "CommunicationChannel": "Default",
      "Addresses": [
        {
          "EntityResolutionState": "EntitiesAvailable",
          "RawSlot": "Craig",
          "CandidateEntities": [
            {
              "EntityId":"827439f5-d509-4a3a-983e-3c2551f4e7a4@72f988bf-86f1-41af-91ab-2d7cd011db47"
            },
            {
              "EntityId": "827439f5-d509-4a3a-983e-3c2551f4e7a4@72f988bf-86f1-41af-91ab-2d7cd011db47"
            },
            {
              "EntityId": "6d82e337-5161-40f5-b929-5dd2a1239519@72f988bf-86f1-41af-91ab-2d7cd011db47"
            }
          ]
        }
      ]
    }
    ],
    "Instrumentation": {
        "TraceId": "2dc43456-48aa-43f3-84da-be3b67273a96"
    }
}"""
        val answer = getAnswer(json)
        println()
        println(answer)

        assertNotNull(answer)
    }

    @Test
    fun testBuildCallAction() {
        val result = buildRequest("Hello", listOf(EntityType.People, EntityType.MeetingProposal), true)

        println(result)
        assertNotNull(result)

    }
}